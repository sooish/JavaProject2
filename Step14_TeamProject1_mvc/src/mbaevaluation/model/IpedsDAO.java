
package mbaevaluation.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import mbaevaluation.model.dto.EducationDTO;
import mbaevaluation.model.dto.IpedsDTO;
import mbaevaluation.model.util.DBUtil;

public class IpedsDAO {
	private static IpedsDAO instance = new IpedsDAO();
	
	IpedsDAO(){};
	public static IpedsDAO getInstance() {
		return instance;
	}
	
	// Ipeds 데이터 넣기
	public static boolean insertIpeds(ArrayList<IpedsDTO> ipeds) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try{
			con = DBUtil.getConnection();
			
			for(int i=0; i<ipeds.size(); i++) {
				IpedsDTO item = ipeds.get(i);
				pstmt = con.prepareStatement("insert into ipeds values(?, ?, ?, ?, ?)");
				pstmt.setString(1, item.getSchool_id());
				pstmt.setString(2, item.getSchool_name());
				pstmt.setString(3, item.getState());
				pstmt.setInt(4, item.getNum_faculty());
				pstmt.setFloat(5, item.getIt_concentration());
				
				int result = pstmt.executeUpdate();
				
				if(result != 1){
					return true;
				}
			}
		
		}finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	
	// school_id로 해당학교 Ipeds 관련 데이터 반환
	public static IpedsDTO getIpeds(String schoolId) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		IpedsDTO ipeds = null;
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from ipeds where school_id=?");
			pstmt.setString(1, schoolId);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				ipeds = new IpedsDTO(rset.getString(1), rset.getString(2), rset.getString(3), rset.getInt(4), rset.getFloat(5));
			}			
		} finally {
		   DBUtil.close(con, pstmt, rset);
		}
		return ipeds;
	}
	
	// 모든 학교  Ipeds 관련 데이터 반환
	public static ArrayList<IpedsDTO> getAllIpeds() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<IpedsDTO> list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from ipeds");
			rset = pstmt.executeQuery();
			
			list = new ArrayList<IpedsDTO>();
			while(rset.next()) {
				list.add(new IpedsDTO(rset.getString(1), rset.getString(2), rset.getString(3), rset.getInt(4), rset.getFloat(5)));
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
	    }
		return list;
	}
}

package mbaevaluation.service;

import java.sql.SQLException;
import mbaevaluation.model.MbaEvaluationService;
import mbaevaluation.view.RunningEndView;
import mbaevaluation.exception.NotExistException;

public class MbaEvaluationController {

	private static MbaEvaluationController instance = new MbaEvaluationController();
	
	MbaEvaluationController(){}
	public static MbaEvaluationController getInstance() {
		return instance;
	}
	
	MbaEvaluationService service = MbaEvaluationService.getInstance();
	
	
	// ��� �б� Ipeds �˻� ����
	public void getAllIpeds() {

		try {
			RunningEndView.ipedsAllListView(service.getAllIpeds());
			RunningEndView.sucessView();  
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}
	
	
	// ��� �б� Ranking �˻� ����
	public void getAllRanking() {

		try {
			RunningEndView.rankingAllListView(service.getAllRanking());
			RunningEndView.sucessView();  
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}
	
	// ��� �б� Education �˻� ����
		public void getAllEducation() {

			try {
				RunningEndView.educationAllListView(service.getAllEducation());
				RunningEndView.sucessView();  
			} catch (SQLException s) {
				s.printStackTrace();
			}
		}
	
	// ��� �б� Finance �˻� ����
		public void getAllFinance() {
	
			try {
				RunningEndView.financeAllListView(service.getAllFinance());
				RunningEndView.sucessView();  
			} catch (SQLException s) {
				s.printStackTrace();
			}
		}

	// ��� �б� Job Opportunity �˻� ����
		public void getAllJobOportunity() {

			try {
				RunningEndView.jobopportunityAllListView(service.getAllJobOpportunity());
				RunningEndView.sucessView();  
			} catch (SQLException s) {
				s.printStackTrace();
			}
		}			
		
	// ���� �б� Ipeds �˻� ����		
		public void getIpeds(String schoolId) {

			try {
				RunningEndView.allView(service.getIpeds(schoolId));
				RunningEndView.sucessView();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (NotExistException s) {
				s.printStackTrace();
			}
		}		
		

	// ���� �б� Raking �˻� ����		
		public void getRanking(String schoolId) {

			try {
				RunningEndView.allView(service.getRanking(schoolId));
				RunningEndView.sucessView();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (NotExistException s) {
				s.printStackTrace();
			}
		}		
		
	// ���� �б� Education �˻� ����		
		public void getEducation(String schoolId) {

			try {
				RunningEndView.allView(service.getEducation(schoolId));
				RunningEndView.sucessView();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (NotExistException s) {
				s.printStackTrace();
			}
		}		

	// ���� �б� Finance �˻� ����		
		public void getFinance(String schoolId) {

			try {
				RunningEndView.allView(service.getFinance(schoolId));
				RunningEndView.sucessView();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (NotExistException s) {
				s.printStackTrace();
			}
		}			

	// ���� �б� Job Opportunity �˻� ����		
		public void getJobOpportunity(String stateId) {

			try {
				RunningEndView.allView(service.getJobOpportunity(stateId));
				RunningEndView.sucessView();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (NotExistException s) {
				s.printStackTrace();
			}
		}
		
	
	
}

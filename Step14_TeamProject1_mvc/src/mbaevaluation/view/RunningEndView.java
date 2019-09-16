package mbaevaluation.view;

import java.util.ArrayList;

import mbaevaluation.model.dto.EducationDTO;
import mbaevaluation.model.dto.FinanceDTO;
import mbaevaluation.model.dto.IpedsDTO;
import mbaevaluation.model.dto.JobOpportunityDTO;
import mbaevaluation.model.dto.RankingDTO;

public class RunningEndView {
	
	
	// ��� �б� Ipeds ���� ������ ���
	
		public static void ipedsAllListView(ArrayList<IpedsDTO> allIpeds) {
			System.out.println("\n***** ��� �б� ipeds �˻� *****");

			int length = allIpeds.size();

			if (length != 0) {
				for (int index = 0; index < length; index++) {
					System.out.println("�˻����� " + (index + 1) + " - " + allIpeds.get(index));
				}
			}
		}

	// ��� �б� Ranking ���� ������ ���
	
	public static void rankingAllListView(ArrayList<RankingDTO> allRanking) {
		System.out.println("\n***** ��� �б� ranking �˻� *****");

		int length = allRanking.size();

		if (length != 0) {
			for (int index = 0; index < length; index++) {
				System.out.println("�˻����� " + (index + 1) + " - " + allRanking.get(index));
			}
		}
	}
	
	// ��� �б� Education ���� ������ ���
	
	public static void educationAllListView(ArrayList<EducationDTO> allEducation) {
		System.out.println("\n***** ��� �б� education �˻� *****");

		int length = allEducation.size();

		if (length != 0) {
			for (int index = 0; index < length; index++) {
				System.out.println("�˻����� " + (index + 1) + " - " + allEducation.get(index));
			}
		}
	}	 
	
	// ��� �б� Job Opportunity ���� ������ ���
	
	public static void jobopportunityAllListView(ArrayList<JobOpportunityDTO> allJobOpportunity) {
		System.out.println("\n***** ��� �б� job opportunity �˻� *****");

		int length = allJobOpportunity.size();

		if (length != 0) {
			for (int index = 0; index < length; index++) {
				System.out.println("�˻����� " + (index + 1) + " - " + allJobOpportunity.get(index));
			}
		}
	}
	
	 
	// ��� �б� Finance ���� ������ ���
	
	public static void financeAllListView(ArrayList<FinanceDTO> allFinance) {
		System.out.println("\n***** ��� �б� finance �˻� *****");

		int length = allFinance.size();

		if (length != 0) {
			for (int index = 0; index < length; index++) {
				System.out.println("�˻����� " + (index + 1) + " - " + allFinance.get(index));
			}
		}
	}
	
	// Ư�� �б� ipeds ���	 
	public static void  ipedsView(RankingDTO  ipeds) {
		System.out.println(ipeds);
	}
	
	// Ư�� �б� Ranking ���
	public static void rankingView(RankingDTO ranking) {
		System.out.println(ranking);
	}

	// Ư�� �б� Education ���
	public static void educationView(EducationDTO education) {
		System.out.println(education);
	}
	
	// Ư�� �б� Job Opportunity ���
	public static void jobopportunityView(JobOpportunityDTO jobopportunity) {
		System.out.println(jobopportunity);
	}
	
	// Ư�� �б� Finance ���
	public static void financeView(FinanceDTO finance) {
		System.out.println(finance);
	}
	
	// ��� DTO ���� ����ϴ� �޼ҵ�
	public static void allView(Object object) {
		System.out.println("\n***** Ư�� ���� �˻� *****");
		System.out.println(object);
	}

	// ���� ��Ȳ ���
	public static void showError(String msg) {
		System.out.println(msg);
	}

	// ���� �޽���
	public static void sucessView() {
		System.out.println("���������� �˻��Ǿ����ϴ�.");
	}
}

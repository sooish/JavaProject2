package mbaevaluation.view;

import mbaevaluation.service.MbaEvaluationController;

public class RunningStartView {

	
	public static void main(String [] args){
		
		MbaEvaluationController controller = MbaEvaluationController.getInstance();


		// ��� �б� Ipeds ���� ������ �˻�
		controller.getAllIpeds();		
		
		// ��� �б� Ranking ���� ������ �˻�
		controller.getAllRanking();
	 
		// ��� �б� Education ���� ������ �˻�
		controller.getAllEducation();
		
		// ��� �б� Finance ���� ������ �˻�
		controller.getAllFinance();
		
		// ��� �б� Job Opportunity ���� ������ �˻�
		controller.getAllJobOportunity();
				
		// Ư�� �б� Ipeds ���� ������ �˻�
		controller.getIpeds("166027");		
				
		// Ư�� �б� Ranking ���� ������ �˻�
		controller.getRanking("243744");
		
		// Ư�� �б� Education ���� ������ �˻�
		controller.getEducation("243744");
		
		// Ư�� �б� Finance ���� ������ �˻�
		controller.getFinance("243744");
		
		// Ư�� �б� Job Opportunity ���� ������ �˻�
		controller.getJobOpportunity("243744");
	 
	}
	
}

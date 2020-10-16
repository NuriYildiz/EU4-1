package assignment_8;

public class question_15 {

	public static void main(String[] args) {


		System.out.println(validateTask(false,3,2));

	}

	public static boolean validateTask(boolean isFull, int taskId, int currentId) {
		if(isFull&&(taskId==currentId+1)) {
		return true;
		}else {
			return false;
		}
	}

}

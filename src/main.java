
public class main {
	public static void main(String[] args) {
	
	StringBuilder enc = new StringBuilder();
	StringBuilder dec = new StringBuilder();
	
	int m = 32, a = 17, b = 11;
	
	String alf = "��������賿�������������������";
	char[] alf_arr = alf.toCharArray();
	System.out.println("������: " + alf);
	String text = "�����";
	char[] text_arr = text.toCharArray();
	System.out.println("����� ���� �������: " + text);
	
	for(int i = 0; i < text_arr.length; i++)
		for(int j = 0; j < alf_arr.length; j++)
			if(text_arr[i] == alf_arr[j])
				enc.append(alf_arr[(j * a + b) % 32]);
	
	System.out.println("������������ �����: " + enc);
	
	for(int i = 0; i < enc.toString().toCharArray().length; i++)
		for(int j = 0; j < alf_arr.length; j++)
			if(enc.toString().toCharArray()[i] == alf_arr[j])
				dec.append(alf_arr[(32 + 17 * (j - b) % 32) % 32]);
	
	System.out.println("������������� �����: " + dec);
	
	}
}
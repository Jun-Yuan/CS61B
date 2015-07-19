package lec4;

public class Sort {
	/**�ɴ�С����*/
	public static void sort(String[] a){
		sort(a,0);
	}
	
	/**��ָ��λ�ÿ�ʼ����*/
	private static void sort(String[] a,int start){
		if (start == a.length)
			return;
		int mindex = indexOfSmallest(a,start);//����С�±�
		swap(a,start,mindex);//����С�±꽻������ǰ��
		sort(a,start+1);//�ݹ�����
	}
	
	/**���ش�ָ��λ�ÿ�ʼ(start)�ַ�������
	 * ����Сһ���ַ������±�*/
	private static int indexOfSmallest(String[] a,int start){
		int minDex = start;
	    int i = start;
		while(i < a.length){
			int compareResult = a[i].compareTo(a[minDex]);
			if(compareResult < 0){
				minDex = i;
			}
			i = i + 1;
		}
		return minDex;
	}
	
	private static void swap(String a[],int start,int mindex){
		String temp = a[start];
		a[start] = a[mindex];
		a[mindex] = temp;
	}
	
	public static void print(String[] a){
		for (int i = 0 ; i < a.length ; ++i){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args){
		String[] a = {"a","huge","tiny","scorpion"};
		sort(a);
		print(a);	
	}
}

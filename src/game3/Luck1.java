package game3;
import java.util.Scanner;
public class Luck1 {
 static Scanner input=new Scanner(System.in);
 static String engName1,pwd1;
 static String [] name=new String[10];             //����name���ע���û���
 static String [] mima=new String[10];             //����mima����û�����
 static int kahao,m=0,n=0,biaohao=0,mi=0;
 public static void main(String[] args) {
  boolean flag=true;                               //������һ��boolean���͵ı�������ʹ��ֵΪtrue
  while(flag){                                     //��flag����ѭ�����ж����ݣ�Ĭ��ѭ��
  System.out.println("*****��ӭ���뽱�͸���ϵͳ**********");
  System.out.println("       1.ע��");
  System.out.println("       2.��¼");
  System.out.println("       3.�齱");
  System.out.println("****************************");
  System.out.println("��ѡ��˵���");
  int user=0;
  user=input.nextInt();
 switch (user) {
        case 1:
         inputZhuce();                //ʵ��ע��ķ���
     break;
        case 2:
     dengLu();                       //ʵ�ֵ�¼�ķ���
     break;
        case 3:
     chouJiang();                    //ʵ�ֳ齱�ķ���
     break;
  default:
	  flag=false;                    //�޸�flag��ֵΪfalse,ʹѭ������
   break;
  }
 }
 }
 public static void inputZhuce(){
  System.out.println("<���͸���ϵͳ>ע��");
     System.out.println("����д����ע����Ϣ");
     System.out.println("�û�����");
     name[biaohao]=input.next();              //���ַ����������name���洢ÿ���û����˺�
     System.out.println("���룺");
     mima[mi]=input.next();                  //���ַ����������mima���洢ÿ���û�������
     System.out.println("ע��ɹ������ס������Ϣ��");
     int kahao=(int)(Math.random()*10);      //������ɵ�ǰ�û�����������kahao�洢
     System.out.println("�û���\t"+"����\t"+"��Ա����");
     System.out.println(name[biaohao]+"\t"+mima[mi]+"\t"+kahao);
     biaohao++;
     mi++;
     m=1;                                    //��ֵΪ1�����ж��û��Ƿ�ע��
     
 }
 
 public static void dengLu(){
  if (m==1) {
   biaohao=0;
   mi=0;
   for (int i = 0; i <3; i++) {
    System.out.println("�û�����");
    engName1=input.next();
    System.out.println("���룺");
    pwd1=input.next();
    for (int j = 0; j < mima.length; j++) {
    if (engName1.equals(name[biaohao])&&pwd1.equals(mima[mi]))//�жϵ�ǰ�����û����������ַ�������name��mima�Ƿ�һ��
    {
     System.out.println("��ϲ������¼�ɹ���");
     n=1;                              //��ֵΪ1�����ж��û��Ƿ��¼
     return;
    }
    biaohao++;
    mi++;
   } 
    System.out.println("�û��������������㻹��"+(2-i)+"�λ��ᣬ���������룡");
   }
  }
  else
   System.out.println("����û��ע�ᣡ");
  }
 public static void chouJiang(){
  if (n==1) {
  int []lnumber=new int[5];
  for (int i = 0; i < lnumber.length; i++) {
   lnumber[i]=(int)(Math.random()*10);
   System.out.println(lnumber[i]);
  }
      System.out.println("���������Ŀ��ţ�");
      kahao=input.nextInt();
     for (int j = 0; j < lnumber.length; j++) {
      if (lnumber[j]==kahao) {
      System.out.println("��ϲ�����н�����"); 
      return ;
       } 
      }
      System.out.println("��Ǹ����û�н���"); 
  }
     else System.out.println("����û�е�¼��");
 }
}

import java.util.*;
public class powersum{
        public static void main(String[] args){
                Scanner lee = new Scanner(System.in);
                int x=lee.nextInt();
                int n=lee.nextInt();
            if(x>=1 && x<=1000 && n>=2 && n<=10){
                double  root = Math.pow(x,1/(double)n);
                int root1=(int)root;
                int[] c=new int[root1];
                int conta=0;
                for(int i=0;i<c.length;i++){
                        c[i]=(int)Math.pow(i+1,n);
                }//end for
                int u=0;
                for(int j=c.length-1;j>=0;j--){
                        u=c[j]+u;
                        for(int k=c.length-1;k>=0;k--){
                                if(u==x){
                                        conta++;
                                        u=c[j]+c[k];
                                        }
                                else if(u<x){
                                        u=u+c[k];
                                        }
                                else{
                                        u=c[j]+c[k];
                                        }
                        }//end for1
                        u=0;
                }//end for2
                System.out.println(conta);
            }//end if
        }//end main

}//end class


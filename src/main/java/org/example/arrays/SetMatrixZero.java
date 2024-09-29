package org.example.arrays;

import java.util.logging.Logger;

public class SetMatrixZero {
    public static void markRowZero(int[][] matrix, int m,int n,int i){
        for(int j=0 ;j<n ; j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
    public static void markColumnZero(int[][] matrix, int m, int n ,int j){
        for(int i=0 ; i<m ; i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
    public static void main(String[] args){
        int[][] matrix = {{1,1,1,1},{1,0,1,0},{1,1,1,1}};
        System.out.println("--------Before Setting to Zeroes------------");
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        //BruteForce Approach   T.C will be O(N*m)*(N+M) + O(N*M)....
        /*for(int i=0 ; i<matrix.length ; i++){
            for (int j=i ; j<matrix[i].length ; j++){
                if(matrix[i][j] == 0 ){
                    markRowZero(matrix,matrix.length,matrix[0].length,i);
                    markColumnZero(matrix, matrix.length,matrix[0].length,j);
                }
            }
        }
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }*/
        //Better Approach using two array
        int n = matrix[0].length;
        int m = matrix.length;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0 ; i<matrix.length; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        System.out.println("--------After Setting to Zeroes------------");
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

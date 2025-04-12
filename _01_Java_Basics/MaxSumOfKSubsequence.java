public static MaxSumOfKSubsequence {
    // Maximizarea castigurilor pe uber
    // Avem un numar de incasari pe zile si vrem sa claculam cele mai mari incasari de k zile consecutive
   public static int sumaMaximaIncasari(int[] incasari, int nrZileConsecutive){}
   if(incasar.length < nrZileConsecutive){
    System.out.println("Input e prea mic.");
    return -1;
   }

   int sumaCurenta = 0;
   //suma initiala de incasari pentru primele k zile
    for(int i = 0; i < nrZileConsecutive; i++){
        sumaCurenta += incasari[i];
    }
   int sumaMaxima = sumaCurenta;    

   for(int i = nrZileConsecutive; i<= incasari.length; i++){
    sumaCurenta = sumaCurenta + incasari[i] - incasari[i - nrZileConsecutive];
    if(sumaCurenta > sumaMaxima){
        sumaMaxima = sumaCurenta;
    }

    return sumaMaxima;

    public static void main(String[] args) {
        int[] incasari = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int nrZileConsecutive = 3;
        System.out.println(sumaMaximaIncasari(incasari, nrZileConsecutive)); 
    }
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4, 5};
    //     int k = 3;
    //     System.out.println(maxSum(arr, k)); // Output: 12
    // }

    // public static int maxSum(int[] arr, int k) {
    //     Arrays.sort(arr);
    //     int sum = 0;
    //     for (int i = arr.length - k; i < arr.length; i++) {
    //         sum += arr[i];
    //     }
    //     return sum;
    // }
}
}

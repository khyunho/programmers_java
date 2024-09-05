class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int num = 0;
        
        if (arr.length==1) {
            return arr[0];
        }
        
        if(arr[0]%arr[1]==0){
            num = arr[0];
            answer = arr[1];
        } else {
            for (int j=1; j<=arr[0]; j++){
                if (arr[1]%j==0 && arr[0]%j==0){
                    num = j;
                    System.out.println(num);
                }
            }
            answer = arr[1]*arr[0]/num;
        }        
        
        for (int i=2; i<arr.length; i++) {
            if(answer%arr[i]==0){
                num = arr[i];
                answer = answer;
            } else {
                for (int j=1; j<=answer; j++){
                    if (arr[i]%j==0 && answer%j==0){
                        num = j;
                        System.out.println(num);
                    }
                }
                answer = arr[i]*answer/num;
            }
        }
          
        return answer;
    }
}
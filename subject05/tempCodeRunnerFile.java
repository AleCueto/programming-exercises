    while(volteado > 0){
      volteado /= 10;
      if((volteado%10) % 2 == 0){
        System.out.print(volteado%10 + " ");
        sumaPar += volteado%10;
      }
    }
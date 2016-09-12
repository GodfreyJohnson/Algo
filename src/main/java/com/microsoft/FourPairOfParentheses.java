package com.microsoft;

public class FourPairOfParentheses {
  /**
   * catalan
   * @url http://baike.baidu.com/link?url=JZSZagPPQ9uLXZ2oVGRb7qR6Ig2G_y_6GguTYVfvX2rlLtZ9xvMAO5Qz-FdCNiyQJSy2VIb7y9ReNgZrxa-7ZEvYfI4KKKIruS6Rfzrh0OVxxk4KDBPin0D7vw0LN7DeDP6GkGb_X4Z9NmVimRGgAK
   * @param n
   * @return
   */
  public int solution(int n) {
    if(n==0)    return 1;
    else return (4*n-2)*solution(n-1)/(n+1);
  }
}

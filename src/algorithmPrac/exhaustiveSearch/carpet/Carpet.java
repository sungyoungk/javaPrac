package algorithmPrac.exhaustiveSearch.carpet;

/**
 * @카펫_level2 p.198
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/42842
 */
public class Carpet {


    // int boundary = (width + height -2) * 2
    // int center = (width * height) - boundary
    // O O O O
    // O X X O
    // O O O O


//    제한사항
//   • 갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
//   • 노란색 격자의 수 y이low는 1 이상 2,000,000 이하인 자연수입니다.
//   • 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.



    int[] solution(int brown, int yellow) {

        for ( int width = 3; width <= 5000; width++) {
            for( int height = 3; height <= width; height ++) {
                int boundary = (width + height -2) * 2;
                int center = (width * height) - boundary;

                if(boundary == brown && center == yellow) {
                    return new int[]{width, height};
                }
            }
        }
        return null;
    }

}

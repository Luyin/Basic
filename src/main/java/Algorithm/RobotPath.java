package Algorithm;

/**
 * Created by myrao_000 on 2017-02-18.
 */
public class RobotPath {
    private char[] direction = {'U', 'D', 'L', 'R'};
    private int totalCount = 0;

    public void run()
    {
        //재귀적으로 풀것
        //2차원 boolean 배열 사용 25*25
        //방문한 곳은 true로 표현

        //시작 지점은 가로 세로 중앙
        int startRowIndex = 12;
        int startColIndex = 12;

        //기본 값은 false이다.
        boolean[][] board = new boolean[25][25];
        board[startRowIndex][startColIndex] = true;

        //12번 이동
        move(board, startRowIndex, startColIndex, 12);

        System.out.println(totalCount);
    }

    public void move(boolean[][] board, int rowIndex, int colIndex, int countMove)
    {
        //12번 모두 움직임
        if(countMove <= 0)
        {
            totalCount++;
            return;
        }

        board[rowIndex][colIndex] = true;

        for(char direc : direction)
        {
            switch (direc)
            {
                case 'U':
                    //위로 한칸 이동
                    //이미 왔던 곳
                    if(board[rowIndex][colIndex+1] == true)
                    {
                        break;
                    }
                    //위로 이동
                    move(board, rowIndex, colIndex+1, countMove-1);
                    break;
                case 'D':
                    //아래로 한칸 이동
                    //이미 왔던 곳
                    if(board[rowIndex][colIndex-1] == true)
                    {
                        break;
                    }
                    move(board, rowIndex, colIndex-1, countMove-1);
                    break;
                case 'L':
                    //좌측으로 한칸 이동
                    //이미 왔던 곳
                    if(board[rowIndex-1][colIndex] == true)
                    {
                        break;
                    }
                    move(board, rowIndex-1, colIndex, countMove-1);
                    break;
                case 'R':
                    //우측으로 한칸 이동
                    //이미 왔던 곳
                    if(board[rowIndex+1][colIndex] == true)
                    {
                        break;
                    }
                    move(board, rowIndex+1, colIndex, countMove-1);
                    break;
            }

        }
        //표시 되돌림
        board[rowIndex][colIndex] = false;
    }
}

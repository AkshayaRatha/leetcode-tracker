// Last updated: 9/8/2026, 3:00:01 PM
1class Solution {
2    static class selva{
3        int i;
4        int j;
5        int time;
6        selva(int i, int j, int time){
7            this.i=i;
8            this.j=j;
9            this.time=time;
10        }
11    }
12
13    public int orangesRotting(int[][] grid) {
14        int time=0;
15        int m=grid.length;
16        int n=grid[0].length;
17        Queue<selva> queue=new LinkedList<>();
18        for(int i=0;i<m;i++){
19            for(int j=0;j<n;j++){
20                if(grid[i][j]==2){
21                    queue.add(new selva(i,j,0));
22                }
23            }
24        }
25        int dir[][]={
26            {0,-1},
27            {0,1},
28            {-1,0},
29            {1,0}
30        };
31        while(!queue.isEmpty()){
32            selva temp=queue.poll();
33            for(int k=0;k<4;k++){
34                int ii=temp.i+dir[k][0];
35                int jj=temp.j+dir[k][1];
36                if(ii>=0 && ii<m && jj>=0 && jj<n && grid[ii][jj]==1){
37                    grid[ii][jj]=2;
38                    queue.add(new selva(ii,jj,temp.time+1));
39                    time=Math.max(time,temp.time+1);
40                }
41            }
42        }
43        for(int i=0;i<m;i++){
44            for(int j=0;j<n;j++){
45                if(grid[i][j]==1) return -1;
46            }
47        }
48        return time;
49    }
50}
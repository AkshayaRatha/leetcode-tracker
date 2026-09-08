// Last updated: 9/8/2026, 3:07:45 PM
1class ZeroEvenOdd {
2    private int n;
3    private boolean zeroPrinted;
4    private int currentNumber;
5    public ZeroEvenOdd(int n) {
6        this.n = n;
7        this.zeroPrinted = false;
8        this.currentNumber = 1;
9    }
10    public void zero(IntConsumer printNumber) throws InterruptedException {
11        while(currentNumber <= n)
12        synchronized(this) {
13            while(zeroPrinted == true)
14                wait();
15            if(currentNumber <= n) {
16                printNumber.accept(0); 
17            }  
18            zeroPrinted = true;
19            notifyAll();
20        
21        }
22    }
23    public void even(IntConsumer printNumber) throws InterruptedException {
24            while(currentNumber <= n)
25            synchronized(this) {
26                while(currentNumber % 2 == 1 || zeroPrinted == false) 
27                    wait();
28                if(currentNumber <= n) {
29                    printNumber.accept(currentNumber); 
30                }      
31                zeroPrinted = false;
32                currentNumber++;
33                notifyAll();
34            }
35        }
36    public void odd(IntConsumer printNumber) throws InterruptedException {
37            while(currentNumber <= n)
38            synchronized(this) {
39                while(currentNumber % 2 == 0 || zeroPrinted == false) 
40                wait();
41            if(currentNumber <= n) {
42                printNumber.accept(currentNumber); 
43            }    
44            zeroPrinted = false;
45            currentNumber++;  
46            notifyAll();
47            }
48        } 
49}
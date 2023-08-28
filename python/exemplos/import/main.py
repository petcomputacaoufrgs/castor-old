import fib as fb

if __name__ == "__main__":
    
    fb.fib(1000)
    
    print(fb.fib2(1000))
    
    for n in fb.fib3(1000):
        print(n, end=' ')
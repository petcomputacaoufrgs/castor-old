def fib(n: int) -> None:    # escreve serie de Fibonacci até n
    a, b = 0, 1
    while a < n:
        print(a, end=' ')
        a, b = b, a+b
    print()

def fib2(n: int) -> list:   # retorna serie de Fibonacci até n
    result = []
    a, b = 0, 1
    while a < n:
        result.append(a)
        a, b = b, a+b
    return result

def fib3(n: int) -> int:   # retorna serie de Fibonacci até n, numero a numero
    a, b = 0, 1
    while a < n:
        yield a
        a, b = b, a+b
    
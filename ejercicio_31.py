"""definimos una funcion"""


def suma_posiciones_pares(a):
    """Devuelve la suma de las posiciones pares"""
    suma = 0
    for i in range(0, len(a), 2):
        suma += a[i]
    return suma


b = [1, 2, 13, 4, 8, 5]
print(suma_posiciones_pares(b))

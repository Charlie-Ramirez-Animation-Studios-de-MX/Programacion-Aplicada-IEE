//Segundo Programa, Promedios en C.  Programas de Programaci�n Aplicada de Ingenier�a El�ctrica Electr�nica F.E.S. Arag�n UNAM 2255, by Charlie
#include <stdio.h>
main()
{
	int n,i;
	float cal[100],suma,prom;
	printf("\nHola BB Este es;");
	printf("\nUn Programa Bergas que calcula el promedio");
	printf("\nCuantas Calificaciones son?:");
	scanf("%i",&n);
	for(i=1;i<=n;i++){
		printf("\nDame la calificacion: ");
		scanf("%f",&cal[i]);
	}
suma=0;
for(i=1;i<=n;i++)
suma=suma+cal[i];
prom=suma/n;
printf("\nEl promedio es: %f",prom);
}


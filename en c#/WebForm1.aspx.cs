using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace FIBONA
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnCal_Click(object sender, EventArgs e)
        {
			//int n1 = Convert.ToInt32(txtNum1.Text.ToString().Trim());
			//int cantidad = Convert.ToInt32(txtNum1.Text.ToString().Trim());
            
            string a = "";
            

            int num = 1, resto, divisor, salirWhile, cantidadNumerosMostrar, contador = 0;

            //Console.Write("Cuantos numeros primos mostramos: ");
            cantidadNumerosMostrar = int.Parse(txtNum1.Text.ToString().Trim());

            // bucle hasta que se hayan encontrado los numeros indicados
            while (contador < cantidadNumerosMostrar)
            {
                divisor = 2; salirWhile = 0;

                // bucle para encontrar los numeros primos
                // la variable num se va incrementando en cada iteracción del primer while
                while ((divisor < num) & (salirWhile == 0))
                {

                    // buscamos el resto de la división
                    resto = num % divisor;

                    if (resto == 0)
                    {
                        salirWhile = 1;
                    }
                    else
                    {
                        divisor = divisor + 1;
                    }
                }

                if (salirWhile == 0)
                {
                    //Console.Write(num + " ");
                    a = a + " " + num.ToString();
                    contador = contador + 1;
                }

                num = num + 1;
            }

            lblRes.Text = a;

        }
    }
}
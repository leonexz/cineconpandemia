<%@page import="clases.Sala"%>
<%
    int numsala=Integer.parseInt(request.getParameter("txtnumsala"));
    int capacsala=Integer.parseInt(request.getParameter("txtcapac"));
    int butacasresev=Integer.parseInt(request.getParameter("txtbutacasreserv"));
    Sala sala=new Sala(numsala, capacsala, butacasresev);
    /*ses importa la clase sala y se asigna variables con los 
    input y con la clase sala se le asigna los atributos correspondientes*/
    int i=0,cont=0;
    /*se crea un contador y un i para 
    hacer el recorrido while siempre q sea menor
    a la capacidad de la sala y el if es para que
    siempre no este ocupado mostrara la butacalibre
    sino estara ocupada y si la fila seran de 5 mostrara
    otra imagen que es espacio y el contador llega a 3 es para
    dividirlo en columnas con un salto
    */
    while(i<capacsala){ 
        if(sala.getListaButacas().get(i).isOcupado()==false){ %>
        <img src="butacaLibre.jpg" width="35px"><%
        }else{ %>
            <img src = "butacaOcupada.png" width="35px"><%
        }
        i++;
        if(i%5==0){ %>
        <img src = "espacio.png" width="35px">
            <% cont++;
            if(cont%3==0){ %>
                <br><%
            }
        }
    }
%>
<footer class="w-100 d-flex align-items justify-content-center bg-secondary text-light">
    Sala: <%=numsala %>
    Capacidad: <%=capacsala %>
    <!--Mostrara los datos y tambien se calcula los porcentajes  y en el footer esta centrado con letra
    blanca un width de 100 con fondo plomo-->
    Reserva COVID: <spam class="text-dark"><%=butacasresev+" ("+(butacasresev*100)/capacsala+")% "%></spam>
</footer>

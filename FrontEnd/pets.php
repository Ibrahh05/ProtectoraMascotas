<?php
$url="http://localhost:8080/listado";
$data=file_get_contents($url);

//json to array
$pets=json_decode($data,true);
?>

<html>
    <head>
        <style>
            html{
                background-color:aquamarine;
            }
            table,tr,th,td{
                border: 1px solid black;
            
            }
            tr{
                color:dimgray;
            }
            td{
                color: gray;
            }
        </style>
    </head>
    <body>
        <table>
            <thead>
                
                <tr>
                    <th>ID</th>
                    <th>NOMBRE</th>
                    <th>NACIMIENTO</th>
                    <th>CHIP</th>
                    <th>CATEGORÍA</th>
                    <th>ADOPTADO</th>
                    <th>ACCIÓN</th>
                </tr>
            </thead>
            <tbody>
                <?php
                    foreach($pets as $pet):
                ?>
                <tr>
                    <td><?= $pet['id']?></td>
                    <td><?= $pet['name']?></td>
                    <td><?= $pet['born']?></td>
                    <td><?= $pet['chip']?></td>
                    <td><?= $pet['category']?></td>
                    <td><?php if($pet['adopt']==1){
                        echo "Si";
                         echo '<td>';
                         echo '';
                        echo '</td>';
                    }else{
                        echo "No";
                        echo '<td>';
                      echo '<form method="post" action="http://localhost:8080/adopt/' . $pet["id"] . '?redirect="http://localhost:3000/FrontEnd/pets.php"">';
                            echo '<button type="submit" >Adoptar</button>';
                        echo '</form>';
                        echo '</td>';
                    } ?></td>
                    
                    
                </tr>
                
                <?php
                    endforeach;
                ?>
            </tbody>
        </table>
    </body>
</html>
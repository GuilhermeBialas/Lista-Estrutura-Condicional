import javax.swing.JOptionPane;
public class Exercicio8Lista2{
    public static void main(String[] args){
 
  JOptionPane.showMessageDialog(null, "Tipo                                Nome                                                                                            Valor"
                                   +"\nBolo                                Bolo Brigadeiro                                                                          R$ 29,50"
                                   +"\nBolo                                Bolo Floresta Negra                                                                  R$ 2,00"
                                   +"\nBolo                                Bolo Leite com Nutella                                                             R$ 29,23"
                                   +"\nBolo                                Bolo Mousse de Chocolate                                                     R$ 7,10"
                                   +"\nBolo                                Bolo Nega Maluca                                                                     R$ 19,33"
                                   +"\nDoces                            Bomba de Creme                                                                      R$ 17,71"
                                   +"\nDoces                            Bomba de Morango                                                                  R$ 4,82"
                                   +"\nSanduíche                    Filé-Mignon com Fritas e cheddar                                        R$ 21,16"
                                   +"\nSanduíche                   Hambúrguer com queijos,champignon e rúcula               R$ 12,70"
                                   +"\nSanduíche                   Provolone com salame                                                            R$ 19,70"
                                   +"\nSanduíche                   Vegetariano de berinjela                                                         R$ 28,22"
                                   +"\nPizzas                          Calabresa                                                                                    R$ 8,98"
                                   +"\nPizzas                          Napolitana                                                                                    R$ 0,42"
                                   +"\nPizzas                          Peruana                                                                                        R$ 18,36"
                                   +"\nPizzas                          Portuguesa                                                                                  R$ 27,50");

                             String produto1 =   JOptionPane.showInputDialog(null,
                                "Selecione o produto",
                                "Cardápio",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                new Object[]{
                                    "", "Bolo|Bolo Brigadeiro", "Bolo|Bolo Floresta Negra", "Bolo|Bolo Leite com Nutella", "Bolo|Bolo Mousse de Chocolate","Bolo|Bolo Nega Maluca",
                                    "Doces|Bomba de creme","Doces|Bomba de Morango","Sanduíche|Filé-Mignon com Fritas e cheddar","Sanduíche|Hambúrguer com queijos,champignon e rúcula",
                                    "Sanduíche|Provolone com salame","Sanduíche|Vegetariano de berinjela","Pizzas|Calabresa","Pizzas|Napolitana","Pizzas|Peruana","Pizzas|Portuguesa"
                                },
                                ""
                                ).toString();
                              
                              
                                double preco1 = 0;
                                if(produto1 == "Bolo|Bolo Brigadeiro"){
                                    preco1 = 29.50;
                                }else if(produto1 =="Bolo|Bolo Floresta Negra"){
                                    preco1 = 2.00;
                                    }else if(produto1 == "Bolo|Bolo Leite com Nutella"){
                                        preco1 = 29.23;
                                    }else if(produto1 == "Bolo|Bolo Mousse de Chocolate"){
                                        preco1 = 7.10;
                                    }else if(produto1 == "Bolo|Bolo Nega Maluca"){
                                        preco1 = 19.33; 
                                    }else if(produto1 == "Doces|Bomba de creme"){
                                        preco1 = 17.71;
                                    }else if(produto1 == "Doces|Bomba de Morango"){
                                        preco1 = 4.82;
                                    }else if(produto1 == "Sanduíche|Filé-Mignon com Fritas e cheddar"){
                                        preco1 =21.16;
                                    }else if(produto1 == "Sanduíche|Hambúrguer com queijos,champignon e rúcula"){
                                        preco1 = 12.70;
                                    }else if(produto1 == "Sanduíche|Provolone com salame"){
                                        preco1 = 19.70;
                                    }else if(produto1 =="Sanduíche|Vegetariano de berinjela"){
                                        preco1 =28.22;
                                    }else if(produto1 == "Pizzas|Calabresa"){
                                        preco1 = 8.98;
                                    }else if(produto1 == "Pizzas|Napolitana"){
                                        preco1 = 0.42;
                                    }else if(produto1 == "Pizzas|Peruana"){
                                        preco1 = 18.36;
                                    }else if(produto1 == "Pizzas|Portuguesa"){
                                    preco1 = 27.50;
                                    }
                                    
                                    JOptionPane.showMessageDialog(null, "Tipo                                Nome                                                                                            Valor"
                                    +"\nBolo                                Bolo Brigadeiro                                                                          R$ 29,50"
                                    +"\nBolo                                Bolo Floresta Negra                                                                  R$ 2,00"
                                    +"\nBolo                                Bolo Leite com Nutella                                                             R$ 29,23"
                                    +"\nBolo                                Bolo Mousse de Chocolate                                                     R$ 7,10"
                                    +"\nBolo                                Bolo Nega Maluca                                                                     R$ 19,33"
                                    +"\nDoces                            Bomba de Creme                                                                      R$ 17,71"
                                    +"\nDoces                            Bomba de Morango                                                                  R$ 4,82"
                                    +"\nSanduíche                    Filé-Mignon com Fritas e cheddar                                        R$ 21,16"
                                    +"\nSanduíche                   Hambúrguer com queijos,champignon e rúcula               R$ 12,70"
                                    +"\nSanduíche                   Provolone com salame                                                            R$ 19,70"
                                    +"\nSanduíche                   Vegetariano de berinjela                                                         R$ 28,22"
                                    +"\nPizzas                          Calabresa                                                                                    R$ 8,98"
                                    +"\nPizzas                          Napolitana                                                                                    R$ 0,42"
                                    +"\nPizzas                          Peruana                                                                                        R$ 18,36"
                                    +"\nPizzas                          Portuguesa                                                                                  R$ 27,50");
 
                      
                                    String produto2 =   JOptionPane.showInputDialog(null,
                                    "Selecione o produto",
                                    "Cardápio",
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    new Object[]{
                                        "", "Bolo|Bolo Brigadeiro", "Bolo|Bolo Floresta Negra", "Bolo|Bolo Leite com Nutella", "Bolo|Bolo Mousse de Chocolate","Bolo|Bolo Nega Maluca",
                                        "Doces|Bomba de creme","Doces|Bomba de Morango","Sanduíche|Filé-Mignon com Fritas e cheddar","Sanduíche|Hambúrguer com queijos,champignon e rúcula",
                                        "Sanduíche|Provolone com salame","Sanduíche|Vegetariano de berinjela","Pizzas|Calabresa","Pizzas|Napolitana","Pizzas|Peruana","Pizzas|Portuguesa"
                                    },
                                    ""
                                    ).toString();
                                 
                                    double preco2 = 0;
                                if(produto2 == "Bolo|Bolo Brigadeiro"){
                                    preco2 = 29.50;
                                }else if(produto2 =="Bolo|Bolo Floresta Negra"){
                                    preco2 = 2.00;
                                    }else if(produto2 == "Bolo|Bolo Leite com Nutella"){
                                        preco2 = 29.23;
                                    }else if(produto2 == "Bolo|Bolo Mousse de Chocolate"){
                                        preco2 = 7.10;
                                    }else if(produto2 == "Bolo|Bolo Nega Maluca"){
                                        preco2 = 19.33; 
                                    }else if(produto2 == "Doces|Bomba de creme"){
                                        preco2 = 17.71;
                                    }else if(produto2 == "Doces|Bomba de Morango"){
                                        preco2 = 4.82;
                                    }else if(produto2 == "Sanduíche|Filé-Mignon com Fritas e cheddar"){
                                        preco2 =21.16;
                                    }else if(produto2 == "Sanduíche|Hambúrguer com queijos,champignon e rúcula"){
                                        preco2 = 12.70;
                                    }else if(produto2 == "Sanduíche|Provolone com salame"){
                                        preco2 = 19.70;
                                    }else if(produto2 =="Sanduíche|Vegetariano de berinjela"){
                                        preco2 =28.22;
                                    }else if(produto2 == "Pizzas|Calabresa"){
                                        preco2 = 8.98;
                                    }else if(produto2 == "Pizzas|Napolitana"){
                                        preco2 = 0.42;
                                    }else if(produto2 == "Pizzas|Peruana"){
                                        preco2 = 18.36;
                                    }else if(produto2 == "Pizzas|Portuguesa"){
                                    preco2 = 27.50;
                                    }

                                    JOptionPane.showMessageDialog(null, "Tipo                                Nome                                                                                            Valor"
                                    +"\nBolo                                Bolo Brigadeiro                                                                          R$ 29,50"
                                    +"\nBolo                                Bolo Floresta Negra                                                                  R$ 2,00"
                                    +"\nBolo                                Bolo Leite com Nutella                                                             R$ 29,23"
                                    +"\nBolo                                Bolo Mousse de Chocolate                                                     R$ 7,10"
                                    +"\nBolo                                Bolo Nega Maluca                                                                     R$ 19,33"
                                    +"\nDoces                            Bomba de Creme                                                                      R$ 17,71"
                                    +"\nDoces                            Bomba de Morango                                                                  R$ 4,82"
                                    +"\nSanduíche                    Filé-Mignon com Fritas e cheddar                                        R$ 21,16"
                                    +"\nSanduíche                   Hambúrguer com queijos,champignon e rúcula               R$ 12,70"
                                    +"\nSanduíche                   Provolone com salame                                                            R$ 19,70"
                                    +"\nSanduíche                   Vegetariano de berinjela                                                         R$ 28,22"
                                    +"\nPizzas                          Calabresa                                                                                    R$ 8,98"
                                    +"\nPizzas                          Napolitana                                                                                    R$ 0,42"
                                    +"\nPizzas                          Peruana                                                                                        R$ 18,36"
                                    +"\nPizzas                          Portuguesa                                                                                  R$ 27,50");
 
                                    String produto3 =   JOptionPane.showInputDialog(null,
                                    "Selecione o produto",
                                    "Cardápio",
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    new Object[]{
                                        "", "Bolo|Bolo Brigadeiro", "Bolo|Bolo Floresta Negra", "Bolo|Bolo Leite com Nutella", "Bolo|Bolo Mousse de Chocolate","Bolo|Bolo Nega Maluca",
                                        "Doces|Bomba de creme","Doces|Bomba de Morango","Sanduíche|Filé-Mignon com Fritas e cheddar","Sanduíche|Hambúrguer com queijos,champignon e rúcula",
                                        "Sanduíche|Provolone com salame","Sanduíche|Vegetariano de berinjela","Pizzas|Calabresa","Pizzas|Napolitana","Pizzas|Peruana","Pizzas|Portuguesa"
                                    },
                                    ""
                                    ).toString();


                                    double preco3 = 0;
                                    if(produto3 == "Bolo|Bolo Brigadeiro"){
                                        preco3 = 29.50;
                                    }else if(produto3 =="Bolo|Bolo Floresta Negra"){
                                        preco3 = 2.00;
                                        }else if(produto3 == "Bolo|Bolo Leite com Nutella"){
                                            preco3 = 29.23;
                                        }else if(produto3 == "Bolo|Bolo Mousse de Chocolate"){
                                            preco3 = 7.10;
                                        }else if(produto3 == "Bolo|Bolo Nega Maluca"){
                                            preco3 = 19.33; 
                                        }else if(produto3 == "Doces|Bomba de creme"){
                                            preco3 = 17.71;
                                        }else if(produto3 == "Doces|Bomba de Morango"){
                                            preco3 = 4.82;
                                        }else if(produto3 == "Sanduíche|Filé-Mignon com Fritas e cheddar"){
                                            preco3 =21.16;
                                        }else if(produto3 == "Sanduíche|Hambúrguer com queijos,champignon e rúcula"){
                                            preco3 = 12.70;
                                        }else if(produto3 == "Sanduíche|Provolone com salame"){
                                            preco3 = 19.70;
                                        }else if(produto3 =="Sanduíche|Vegetariano de berinjela"){
                                            preco3 =28.22;
                                        }else if(produto3 == "Pizzas|Calabresa"){
                                            preco3 = 8.98;
                                        }else if(produto3 == "Pizzas|Napolitana"){
                                            preco3 = 0.42;
                                        }else if(produto3 == "Pizzas|Peruana"){
                                            preco3 = 18.36;
                                        }else if(produto3 == "Pizzas|Portuguesa"){
                                        preco3 = 27.50;
                                        }

       double soma = preco1 + preco2+ preco3;
       JOptionPane.showMessageDialog(null, "              Recibo       "
                                          + "\n"+produto1  +" " +"R$"+preco1
                                          +"\n "+produto2 +" "+"R$"+preco2
                                          +"\n" +produto3+ " "+"R$"+preco3
                                          +"\nO total é: "+"R$"+soma);

    }        
}
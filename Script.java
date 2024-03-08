const botoes = document.querySelectionAll(".botao");

for(let i=0;i <botao.length;i++){
    botoe[i].onclick = function(){

        for(let j=0;j<botoes.length;j++){
             botoes[j].classlist.remove("ativo");
        }
        botoes[i].classlist.add("ativo");
    }
}
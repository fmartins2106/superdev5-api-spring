async function getAlunos(){
    const respostaAPI = await fetch("http://localhost:8080/alunos/todos-alunos");
    const alunoList = await respostaAPI.json();
    
    const divAlunoList = document.getElementById('alunoList');

    if(alunoList.length > 0){
        divAlunoList.innerHTML = alunoList;
    }else{
        divAlunoList.innerHTML = '<p> Nenhum registro de aluno encontrado.</p>'
    }
}

getAlunos();

function adicionarAluno() {
    
}
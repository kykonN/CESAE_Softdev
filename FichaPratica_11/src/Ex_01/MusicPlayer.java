package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {

    // inicialização do ARRAY
    ArrayList<Musica>programacao;

    public MusicPlayer(){
        this.programacao = new ArrayList<>();
    }

    /**
     * Metodo para adicionar musicas ao ArrayList
     * @param musicaNova
     */
    public void addMusica(Musica musicaNova) {
        this.programacao.add(musicaNova);
    }

    /**
     * Metodo para trocar musicas no ArrayList
     * @param index1
     * @param index2
     */
    public void trocarMusicas(int index1, int index2) {
        Musica musica1 = this.programacao.get(index1);
        Musica musica2 = this.programacao.get(index2);

        this.programacao.set(index1, musica2);
        this.programacao.set(index2, musica1);
    }

    /**
     * Metodo para remover musica do ArrayList
     * @param musica
     */
    public void removeMusica(Musica musica) {
        this.programacao.remove(musica);
    }



}

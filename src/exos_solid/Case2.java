package exos_solid;

// 1. Commencer par critiquer le code écrit en mettant en avant les problèmes
// certaines méthodes ne sont pas applicables pour tous les médias
// 2. Proposer une solution :
// créer une interface par méthode et les implémenter quand elles sont applicables.
// 3. Regarder attentivement la méthode main. Est-ce que c'est cohérent de typer toutes
// ces sous classes selon leur parent
// toutes ces classes héritent de SocialMedia : on peut typer selon leurs classes respectives
public class Case2 {
    public static void main(String[] args) {
        ISocialMedia whatsapp=new Whatsapp();
        ISocialMedia instagram=new Instagram();
        ISocialMedia facebook=new Facebook();
    }
}

interface Video {
    void groupVideoCall(String ...user);
}

interface Post {
    void publishPost(Object post);
}
interface ISocialMedia {

    //@support WhatsApp,Facebook,Instagram
    void chatWithFriend();

    //@support WhatsApp,Facebook,Instagram
    void sendPhotosAndVideos();
}


class Facebook implements ISocialMedia, Post, Video {

    public void chatWithFriend() {

    }

    public void publishPost(Object post) {

    }

    public void sendPhotosAndVideos() {

    }

    public void groupVideoCall(String... users) {

    }
}


class Instagram implements ISocialMedia, Post {

    public void chatWithFriend() {

    }

    public void publishPost(Object post) {

    }

    public void sendPhotosAndVideos() {

    }
}


class Whatsapp implements ISocialMedia, Video {

    public void chatWithFriend() {

    }

    public void sendPhotosAndVideos() {

    }

    public void groupVideoCall(String... users) {

    }
}

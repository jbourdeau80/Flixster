
## Flix Partie 2

### Histoires d'utilisateurs

#### OBLIGATOIRE (10pts)

- [x] (8pts) Exposez les détails du film (notes à l'aide de RatingBar, popularité et synopsis) dans une activité distincte.
- [x] (2pts) Autoriser la lecture des publications vidéo en plein écran à l'aide de YouTubePlayerView.

#### PRIME

- [x] Implémenter une transition d'élément partagé lorsque l'utilisateur clique sur les détails d'un film (1 point).
- [x] Les bandes-annonces des films populaires sont lues automatiquement lorsque le film est sélectionné (1 point).
  - [x] Lorsque vous cliquez sur un film populaire (c'est-à-dire un film voté pour plus de 5 étoiles), la vidéo doit être lue immédiatement.
  - [x] Les vidéos moins populaires s'appuient sur la page détaillée doivent afficher un aperçu de l'image qui peut lancer la lecture d'une vidéo YouTube.
- [x] Ajoutez une superposition d'icône de lecture aux films populaires pour indiquer que le film peut être lu (1 point).
- [x] Appliquer la liaison de données pour les vues pour aider à supprimer le code passe-partout. (1 point)
- [x] Ajoutez des coins arrondis pour les images en utilisant les transformations Glide. (1 point)

### App Walkthrough GIF


<img src="flix_video2.gif" width=250><br>

### Remarques

Décrivez les difficultés rencontrées lors de la création de l'application.

## Bibliothèques open-source utilisées
- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Requêtes HTTP asynchrones simples avec analyse JSON
- [Glide](https://github.com/bumptech/glide) - Bibliothèque de chargement et de mise en cache d'images pour Android## Flix Partie 1




## Flix Partie 1

### Histoires d'utilisateurs

#### OBLIGATOIRE (10pts)
- [x] (10pts) L'utilisateur peut afficher une liste des films (titre, image d'affiche et aperçu) actuellement diffusés dans les salles à partir de l'API Movie Database.

#### PRIME
- [x] (2pts) Les vues doivent être réactives en mode paysage/portrait.
   - [x] (1pt) En mode portrait, l'image de l'affiche, le titre et l'aperçu du film sont affichés.
   - [x] (1pt) En mode paysage, la mise en page alternative pivotée doit utiliser l'image de fond à la place et afficher le titre et l'aperçu du film à droite de celle-ci.

- [x] (2pts) Affichez un joli [graphique d'espace réservé] (https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#advanced-usage) par défaut pour chaque image lors du chargement
- [x] (2pts) Amélioration de l'interface utilisateur en expérimentant le style et la coloration.
- [x] (2pts) Pour les films populaires (c'est-à-dire un film voté pour plus de 5 étoiles), l'image de fond complète est affichée. Sinon, une image d'affiche, le titre du film et une vue d'ensemble sont répertoriés. Utilisez Heterogenous RecyclerViews et utilisez différents fichiers de mise en page ViewHolder pour les films populaires et les moins populaires.

### App Walkthrough GIF

<img src="flix_video.gif" width=250><br>

### Remarques
Décrivez les difficultés rencontrées lors de la création de l'application.

### Bibliothèques open-source utilisées

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Requêtes HTTP asynchrones simples avec analyse JSON
- [Glide](https://github.com/bumptech/glide) - Bibliothèque de chargement et de mise en cache d'images pour Androids# Flixster
Flixster app

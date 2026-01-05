#RentalService - Guide d'installation et d'exécution
Description
RentalService est une application java executable avec ou sans Docker

## Prérequis

- Java 21+
- Docker Desktop (optionnel)
- Gradle

## Installation et exécution

### Méthode 1 : sans Docker

- Installer Installer Java JDK 21 pour le projet
- Compiler le projet (compiler) avec la commande <br>

linux:

```
./gradlew build
```

ou
Windows (cmd):

```
gradlew build
```

Lancer le projet java avec la commande:

```
java -jar build/libs/RentalService-0.0.1-SNAPSHOT.jar
```

Voir le résultat à l'adresse :http://localhost:8080/bonjour

---

### Méthode 2 : avec Docker

Créer dans le dosier RentalService un fichier Dockerfile et ajoute :

```
FROM eclipse-temurin:21
VOLUME /tmp
EXPOSE 8080
ADD ./build/libs/RentalService-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
```

Compiler le projet (compiler) avec la commande :
linux

```
./gradlew build
```

ou
Windows (cmd)

```
gradlew build
```

Dans le terminal créer l'image docker:

```
docker build -t rentalservice .
```

Puis lancer le progamme avec docker run:

```
docker run -p 8080:8080 rentalservice
```

Voir le résultat à l'adresse :http://localhost:8080/bonjour

## Publier l'image dans Docker Hub

Se connecter au Docker Hub

```bash
docker login
```

Faire un tag de l'image :

```bash
docker tag rentalservice 88wiwi/rentalservice:latest
```

Faire un push de l'image dans le Hub:

```bash
docker push 88wiwi/rentalservice:latest
```

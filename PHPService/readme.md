# Microservice PHP - Retour de Prénom

## 📋 Description

Microservice PHP ultra-léger qui retourne le prénom **"HO Hao Xuan Wilhem"** en réponse à une requête HTTP GET.

## 🚀 Fonctionnalités

- Retourne le prénom **"HO Hao Xuan Wilhem"** en texte brut
- Service HTTP minimaliste
- Conteneurisé avec Docker
- Configuration simple et légère

## 🛠️ Technologies

- PHP 8.2
- Docker
- Serveur web PHP intégré

## 📁 Structure du projet

```plaintext
PHPService/
├── Dockerfile          # Configuration Docker
├── microservice.php    # Code source PHP
└── README.md           # Documentation
```

## Lancement avec Docker

## 1. Cloner / Initialiser le projet

```
git clone <url>
cd PHPService
```

## 2. Construire l'image Docker

```

docker build -t microservice-prenom .
```

## 3.Lancer le conteneur

```

docker run -p 8000:8000 microservice-prenom
```

## Accéder au service

- Navigateur web :

http://localhost:8000

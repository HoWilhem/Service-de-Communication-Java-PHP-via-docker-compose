<?php
if (isset($_GET['name'])) {
    echo "Nom reçu depuis Java : " . htmlspecialchars($_GET['name']);
} else {
    echo "Aucun nom reçu";
}

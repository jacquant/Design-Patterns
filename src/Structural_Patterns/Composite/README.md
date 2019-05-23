# Structural Patterns

## Composite

![](Composite_UML_class_diagram_fr.svg.png)

### Intention 

Organiser les objets dans un arbre hiérarchique pour traiter les objets de manière individuelle ou composée uniformément.

### Application

A utiliser pour:

- Représenter des hiérarchies (parties/tout) d'objets.
- Ignorer la différence entre un objet individuel et une composition d'objets.

### Structure

La méthode _getChildren()_ renvoie par défaut la liste vide et est implémentée dans le composite pour renvoyer les noeuds enfants.

### Conséquences

- Le client peut traiter les structures composées et les objets individuels de manière uniforme.
- Il est plus facile d'ajouter des nouveaux composants.
- Désavantage: le design peut devenir trop général. Parfois, il est nécessaire qu'une structure composée n'aie que certains composants.
Or, avec ce système, il n'est pas possible de vérifier cette contrainte juste avec du typage. Un contrôle d'exécution est nécessaire.

### Conseil d'implémentation

- Partage de composants.
- Maximiser l'interface du composant.
- Déclarer les opérations de gestion des enfants.
- Le composant doit-il implémenter une liste de composants?
- Ordonnacement des Enfants.
- Mise en cache pour améliorer les performances
- Qui devrait supprimer les composants.
- Quelle est la meilleure structure de données pour stocker des composants?
# Creational Patterns

## Singleton

![](Singleton_UML_class_diagram.svg.png)

### Intention

S'assurer q'une classe ne possède qu'une et une seule instance, avec un point d'accès global.

### Motivation

La meilleure solution est de rendre cette classe elle-même responsable de garder la trace de sa seule instance.

### Conséquences

- Accès contrôlé à cette seule instance (on peut compter le nombre d'appels par exemple)
- Réduit l'espace des noms (la variable globale n'est plus stockée)
- Permet de faire des affinages (peut être sous-classée, configurée, etc)
- Permet un nombre variable d'instance: il est facilement possible de modifier le pattern pour avoir plusieurs instances (ex: un fichier de log par langue)

### Remarques
Attention, l'usage du double checked locking est une mauvaise idée en Java. Ça ne fonctionne simplement pas dans un environnement multithread. Idem pour « volatile ».

Il est à noter que l'usage du pattern singleton en Java n'est pas des plus approprié car l’instanciation tardive de la classe que l'on cherche à obtenir est en fait le comportement par défaut du Java et le pattern "standard" risque juste de générer des bugs et des complications. En effet le ClassLoader de la JVM va charger les classes à la première utilisation et donc :

1. Le mutex (la variable du synchronized) quel qu'il soit est créé à ce moment et donc est très artificiel ;
2. La classe est nativement un singleton sur lequel il est naturel de s’appuyer.

À partir de cette remarque plusieurs implémentations sont possibles :

1. Initialisation directe de la variable instance.
```java
public final class Singleton {
  private final static Singleton instance = new Singleton();
  public final static Singleton getInstance() { return instance; }
  private Singleton() {}
}
```
2. Initialisation dans un bloc "static".
```java
public final class Singleton {
  private static Singleton instance = null;
  static {
    instance = new Singleton();
  }
  public final static Singleton getInstance() { return instance; }
  private Singleton() {}
}
```
3. Utilisation d'un "enum" à la place d'une classe.
```java
public enum Singleton {
  SINGLETON;
}
```
L'utilisation se fait par appel de la seule valeur de l'enum:
```java
Singleton.SINGLETON;
```
Cette dernière forme est fortement recommandée depuis Java 1.5.

À noter que l'unicité du singleton est dépendante de l'unicité du ClassLoader.
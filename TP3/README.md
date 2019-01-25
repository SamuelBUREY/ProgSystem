<h1> TP3 Prog System </h1>

<h2>1. ExecutorService et Runnable </h2>


<p>Question 1 : Y-a t-il des données partagées ? Lesquelles ?</p>

<p>1) Non  il n'y a aucune données partagée car  pour chaque thread nous avons besoin uniquement d'un string pour l'url.</p>


<p>Question 2 : Soit nbthreads le nb de threads du Pool. A combien fixez vous nbthreads et pourquoi ?</p>

<p>2)On pourrait configurer le nombre de thread a 18 (nombre d'url dans la liste) pour pouvoir executer toutes les url en même temps.</p>

<h3>2. ExecutorService, Callable et FutureTask</h3>

<p>Question 1 : Quelle est la solution que vous avez retenue pour effectuer la tache "addition de bananes"?</p>

<p>1) J'ai utilisé la classe Future qui permet de récupérer l'object retournée par un callable. Puis j'ai additionner à l'attribut de la classe Ramasseur.</p>

<p>Question 2 : Le rédacteur de ce TP va supposer que vous avez suivi le cours et l'avez ouvert. De ce fait, la collection a été implantée pour garantir l'exclusion mutuelle :-).Quels sont les changements à apporter ?</p>

<p>2) On pourrait utiliser une ArrayBLocingQueue pour  permettre l'exclusion mutelle.</p>

<p>Question 3 : On veut maintenant que les singes injectent dans la collection non pas un nombre, mais une collection de Bananes (On a donc une classe Banane). Quelle collection prendre ? Est-elle ThreadSafe ?</p>


<p>3) On utlise l'ArrayBlockQueue qui est ThreadSafe.</p>


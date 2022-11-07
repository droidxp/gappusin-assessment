class de.nurogames.android.ticb.base.tinysanta$2 implements de.hellowins.HellowinsUpdateHandler {
	 /* .source "tinysanta.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/tinysanta;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.tinysanta this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.tinysanta$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 544 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void apiUpdate ( de.hellowins.game.data.HellowinsResponseData p0 ) {
/* .locals 10 */
/* .param p1, "arg0" # Lde/hellowins/game/data/HellowinsResponseData; */
/* .prologue */
int v9 = 1; // const/4 v9, 0x1
int v8 = 0; // const/4 v8, 0x0
/* .line 549 */
v4 = java.lang.System.out;
final String v5 = "-- update response"; // const-string v5, "-- update response"
(( java.io.PrintStream ) v4 ).println ( v5 ); // invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 550 */
v4 = java.lang.System.out;
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "User: "; // const-string v6, "User: "
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( de.hellowins.game.data.HellowinsResponseData ) p1 ).getUser ( ); // invoke-virtual {p1}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v4 ).println ( v5 ); // invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 551 */
v4 = java.lang.System.out;
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "Status: "; // const-string v6, "Status: "
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v6 = (( de.hellowins.game.data.HellowinsResponseData ) p1 ).getStatus ( ); // invoke-virtual {p1}, Lde/hellowins/game/data/HellowinsResponseData;->getStatus()I
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v4 ).println ( v5 ); // invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 552 */
v4 = java.lang.System.out;
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "Running: "; // const-string v6, "Running: "
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v6 = (( de.hellowins.game.data.HellowinsResponseData ) p1 ).isGameRunning ( ); // invoke-virtual {p1}, Lde/hellowins/game/data/HellowinsResponseData;->isGameRunning()Z
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v4 ).println ( v5 ); // invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 553 */
v4 = java.lang.System.out;
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "Finished: "; // const-string v6, "Finished: "
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v6 = de.hellowins.Hellowins .getInstance ( );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v4 ).println ( v5 ); // invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 554 */
v4 = java.lang.System.out;
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "Playtime: "; // const-string v6, "Playtime: "
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( de.hellowins.game.data.HellowinsResponseData ) p1 ).getUser ( ); // invoke-virtual {p1}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
/* iget-wide v6, v6, Lde/hellowins/game/data/HellowinsUserData;->playTime:J */
(( java.lang.StringBuilder ) v5 ).append ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v4 ).println ( v5 ); // invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 555 */
v4 = java.lang.System.out;
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "Time: "; // const-string v6, "Time: "
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( de.hellowins.game.data.HellowinsResponseData ) p1 ).getUser ( ); // invoke-virtual {p1}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
v6 = this.time;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v4 ).println ( v5 ); // invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 556 */
v4 = java.lang.System.out;
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "Highscore: "; // const-string v6, "Highscore: "
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v6 = (( de.hellowins.game.data.HellowinsResponseData ) p1 ).getHighscore ( ); // invoke-virtual {p1}, Lde/hellowins/game/data/HellowinsResponseData;->getHighscore()I
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v6 = ", "; // const-string v6, ", "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = de.hellowins.Hellowins .getInstance ( );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v4 ).println ( v5 ); // invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 558 */
/* sget-boolean v4, Lde/nurogames/android/ticb/base/tinysanta;->wasHellowinsSessionRunnning:Z */
if ( v4 != null) { // if-eqz v4, :cond_0
	 (( de.hellowins.game.data.HellowinsResponseData ) p1 ).getUser ( ); // invoke-virtual {p1}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
	 /* iget-wide v4, v4, Lde/hellowins/game/data/HellowinsUserData;->playTime:J */
	 /* const-wide/16 v6, 0x0 */
	 /* cmp-long v4, v4, v6 */
	 /* if-nez v4, :cond_0 */
	 /* .line 560 */
	 de.nurogames.android.ticb.base.tinysanta.wasHellowinsSessionRunnning = (v8!= 0);
	 /* .line 562 */
	 v4 = de.nurogames.android.ticb.base.tinysanta.sTinyBee;
	 (( android.app.Activity ) v4 ).getLayoutInflater ( ); // invoke-virtual {v4}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;
	 /* .line 563 */
	 /* .local v3, "inflater":Landroid/view/LayoutInflater; */
	 int v5 = 0; // const/4 v5, 0x0
	 (( android.view.LayoutInflater ) v3 ).inflate ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
	 /* .line 565 */
	 /* .local v1, "content":Landroid/view/View; */
	 /* new-instance v2, Landroid/app/Dialog; */
	 v4 = de.nurogames.android.ticb.base.tinysanta.sTinyBee;
	 /* invoke-direct {v2, v4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V */
	 /* .line 566 */
	 /* .local v2, "dialog":Landroid/app/Dialog; */
	 (( android.app.Dialog ) v2 ).requestWindowFeature ( v9 ); // invoke-virtual {v2, v9}, Landroid/app/Dialog;->requestWindowFeature(I)Z
	 /* .line 567 */
	 (( android.app.Dialog ) v2 ).getWindow ( ); // invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
	 /* new-instance v5, Landroid/graphics/drawable/ColorDrawable; */
	 /* invoke-direct {v5, v8}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V */
	 (( android.view.Window ) v4 ).setBackgroundDrawable ( v5 ); // invoke-virtual {v4, v5}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
	 /* .line 569 */
	 (( android.app.Dialog ) v2 ).setContentView ( v1 ); // invoke-virtual {v2, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V
	 /* .line 570 */
	 (( android.app.Dialog ) v2 ).setCancelable ( v9 ); // invoke-virtual {v2, v9}, Landroid/app/Dialog;->setCancelable(Z)V
	 /* .line 571 */
	 (( android.app.Dialog ) v2 ).show ( ); // invoke-virtual {v2}, Landroid/app/Dialog;->show()V
	 /* .line 573 */
	 (( android.app.Dialog ) v2 ).findViewById ( v4 ); // invoke-virtual {v2, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/Button; */
	 /* .line 574 */
	 /* .local v0, "close":Landroid/widget/Button; */
	 /* new-instance v4, Lde/nurogames/android/ticb/base/tinysanta$2$1; */
	 /* invoke-direct {v4, p0, v2}, Lde/nurogames/android/ticb/base/tinysanta$2$1;-><init>(Lde/nurogames/android/ticb/base/tinysanta$2;Landroid/app/Dialog;)V */
	 (( android.widget.Button ) v0 ).setOnClickListener ( v4 ); // invoke-virtual {v0, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
	 /* .line 581 */
	 /* new-instance v4, Lde/nurogames/android/ticb/base/tinysanta$2$2; */
	 /* invoke-direct {v4, p0}, Lde/nurogames/android/ticb/base/tinysanta$2$2;-><init>(Lde/nurogames/android/ticb/base/tinysanta$2;)V */
	 (( android.app.Dialog ) v2 ).setOnDismissListener ( v4 ); // invoke-virtual {v2, v4}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
	 /* .line 593 */
} // .end local v0 # "close":Landroid/widget/Button;
} // .end local v1 # "content":Landroid/view/View;
} // .end local v2 # "dialog":Landroid/app/Dialog;
} // .end local v3 # "inflater":Landroid/view/LayoutInflater;
} // :cond_0
return;
} // .end method

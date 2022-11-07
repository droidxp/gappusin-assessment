public class com.google.ads.internal.j$a implements android.gesture.GestureOverlayView$OnGesturePerformedListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/internal/j; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # instance fields */
private final android.gesture.GestureStore a;
private android.app.Activity b;
private com.google.ads.internal.d c;
/* # direct methods */
public com.google.ads.internal.j$a ( ) {
/* .locals 0 */
/* .prologue */
/* .line 65 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 66 */
this.b = p1;
/* .line 67 */
this.c = p2;
/* .line 68 */
this.a = p3;
/* .line 69 */
return;
} // .end method
static android.app.Activity a ( com.google.ads.internal.j$a p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 60 */
v0 = this.b;
} // .end method
/* # virtual methods */
public void onGesturePerformed ( android.gesture.GestureOverlayView p0, android.gesture.Gesture p1 ) {
/* .locals 7 */
/* .param p1, "overlay" # Landroid/gesture/GestureOverlayView; */
/* .param p2, "gesture" # Landroid/gesture/Gesture; */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 73 */
v0 = this.a;
(( android.gesture.GestureStore ) v0 ).recognize ( p2 ); // invoke-virtual {v0, p2}, Landroid/gesture/GestureStore;->recognize(Landroid/gesture/Gesture;)Ljava/util/ArrayList;
/* .line 75 */
(( java.util.ArrayList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Landroid/gesture/Prediction; */
/* .line 76 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Gesture: \'"; // const-string v4, "Gesture: \'"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.name;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\' = "; // const-string v4, "\' = "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v4, v0, Landroid/gesture/Prediction;->score:D */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v0 );
/* .line 79 */
} // :cond_0
v0 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-nez v0, :cond_2 */
/* .line 80 */
final String v0 = "Gesture: No remotely reasonable predictions"; // const-string v0, "Gesture: No remotely reasonable predictions"
com.google.ads.util.b .a ( v0 );
/* .line 111 */
} // :cond_1
} // :goto_1
return;
/* .line 81 */
} // :cond_2
(( java.util.ArrayList ) v1 ).get ( v6 ); // invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/gesture/Prediction; */
/* iget-wide v2, v0, Landroid/gesture/Prediction;->score:D */
/* const-wide/high16 v4, 0x4000000000000000L # 2.0 */
/* cmpl-double v0, v2, v4 */
/* if-lez v0, :cond_1 */
/* .line 82 */
final String v2 = "debug"; // const-string v2, "debug"
(( java.util.ArrayList ) v1 ).get ( v6 ); // invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/gesture/Prediction; */
v0 = this.name;
v0 = (( java.lang.String ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 83 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 84 */
v0 = this.c;
(( com.google.ads.internal.d ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->c()Ljava/lang/String;
/* if-nez v0, :cond_3 */
final String v0 = "[No diagnostics available]"; // const-string v0, "[No diagnostics available]"
/* .line 87 */
} // :goto_2
/* new-instance v1, Landroid/app/AlertDialog$Builder; */
v2 = this.b;
/* invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
(( android.app.AlertDialog$Builder ) v1 ).setMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v2 = "Ad Information"; // const-string v2, "Ad Information"
(( android.app.AlertDialog$Builder ) v1 ).setTitle ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v2 = "Share"; // const-string v2, "Share"
/* new-instance v3, Lcom/google/ads/internal/j$a$2; */
/* invoke-direct {v3, p0, v0}, Lcom/google/ads/internal/j$a$2;-><init>(Lcom/google/ads/internal/j$a;Ljava/lang/String;)V */
(( android.app.AlertDialog$Builder ) v1 ).setPositiveButton ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
final String v1 = "Close"; // const-string v1, "Close"
/* new-instance v2, Lcom/google/ads/internal/j$a$1; */
/* invoke-direct {v2, p0}, Lcom/google/ads/internal/j$a$1;-><init>(Lcom/google/ads/internal/j$a;)V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
(( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
/* .line 84 */
} // :cond_3
v0 = this.c;
(( com.google.ads.internal.d ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->c()Ljava/lang/String;
} // .end method

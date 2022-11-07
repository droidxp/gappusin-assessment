class com.Ina.Notegre.MoreActivity$2 implements android.content.DialogInterface$OnClickListener {
	 /* .source "MoreActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/Ina/Notegre/MoreActivity;->startBackup()Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.Notegre.MoreActivity this$0; //synthetic
/* # direct methods */
 com.Ina.Notegre.MoreActivity$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 152 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 5 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 158 */
/* new-instance v1, Ljava/lang/StringBuilder; */
v2 = this.this$0;
com.Ina.Notegre.MoreActivity .access$3 ( v2 );
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v2 = "/SimpleNote/"; // const-string v2, "/SimpleNote/"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 159 */
/* .local v0, "pathString":Ljava/lang/String; */
v1 = this.this$0;
com.Ina.Notegre.MoreActivity .access$4 ( v1,v0 );
/* .line 160 */
v1 = this.this$0;
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "backup.xml"; // const-string v3, "backup.xml"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v3 = this.this$0;
com.Ina.Notegre.MoreActivity .access$5 ( v3 );
v1 = com.Ina.Notegre.MoreActivity .access$6 ( v1,v2,v3 );
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 161 */
	 v1 = this.this$0;
	 v2 = this.this$0;
	 /* const v3, 0x7f070021 */
	 (( com.Ina.Notegre.MoreActivity ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Lcom/Ina/Notegre/MoreActivity;->getString(I)Ljava/lang/String;
	 android.widget.Toast .makeText ( v1,v2,v4 );
	 (( android.widget.Toast ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/widget/Toast;->show()V
	 /* .line 164 */
} // :goto_0
return;
/* .line 163 */
} // :cond_0
v1 = this.this$0;
v2 = this.this$0;
/* const v3, 0x7f070022 */
(( com.Ina.Notegre.MoreActivity ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Lcom/Ina/Notegre/MoreActivity;->getString(I)Ljava/lang/String;
android.widget.Toast .makeText ( v1,v2,v4 );
(( android.widget.Toast ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/widget/Toast;->show()V
} // .end method

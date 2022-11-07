class com.openfeint.internal.OpenFeintInternal$10$1 implements com.openfeint.internal.request.IRawRequestDelegate {
	 /* .source "OpenFeintInternal.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/OpenFeintInternal$10;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.OpenFeintInternal$10 this$1; //synthetic
final com.openfeint.api.resource.User val$savedUser; //synthetic
/* # direct methods */
 com.openfeint.internal.OpenFeintInternal$10$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 927 */
this.this$1 = p1;
this.val$savedUser = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onResponse ( Integer p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p1, "responseCode" # I */
/* .param p2, "responseBody" # Ljava/lang/String; */
/* .prologue */
/* .line 929 */
/* const/16 v0, 0xc8 */
/* if-gt v0, p1, :cond_0 */
/* const/16 v0, 0x12c */
/* if-lt p1, v0, :cond_2 */
/* .line 930 */
} // :cond_0
/* const/16 v0, 0x193 */
/* if-ne v0, p1, :cond_1 */
/* .line 932 */
v0 = this.this$1;
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
com.openfeint.internal.OpenFeintInternal .access$1302 ( v0,v1 );
/* .line 941 */
} // :goto_0
return;
/* .line 935 */
} // :cond_1
v0 = this.this$1;
v0 = this.this$0;
v1 = this.this$1;
/* iget-boolean v1, v1, Lcom/openfeint/internal/OpenFeintInternal$10;->val$spotlight:Z */
(( com.openfeint.internal.OpenFeintInternal ) v0 ).launchIntroFlow ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/OpenFeintInternal;->launchIntroFlow(Z)V
/* .line 939 */
} // :cond_2
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Welcome back "; // const-string v1, "Welcome back "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val$savedUser;
v1 = this.name;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = com.openfeint.api.Notification$Category.Login;
v2 = com.openfeint.api.Notification$Type.Success;
com.openfeint.internal.notifications.SimpleNotification .show ( v0,v1,v2 );
} // .end method

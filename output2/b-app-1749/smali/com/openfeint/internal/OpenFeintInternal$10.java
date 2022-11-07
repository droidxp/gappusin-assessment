class com.openfeint.internal.OpenFeintInternal$10 implements java.lang.Runnable {
	 /* .source "OpenFeintInternal.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/OpenFeintInternal;->login(Z)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.OpenFeintInternal this$0; //synthetic
final Boolean val$spotlight; //synthetic
/* # direct methods */
 com.openfeint.internal.OpenFeintInternal$10 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 912 */
this.this$0 = p1;
/* iput-boolean p2, p0, Lcom/openfeint/internal/OpenFeintInternal$10;->val$spotlight:Z */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 914 */
v1 = this.this$0;
v1 = com.openfeint.internal.OpenFeintInternal .access$1000 ( v1 );
/* if-nez v1, :cond_0 */
v1 = this.this$0;
v1 = com.openfeint.internal.OpenFeintInternal .access$700 ( v1 );
/* if-nez v1, :cond_0 */
v1 = this.this$0;
v1 = (( com.openfeint.internal.OpenFeintInternal ) v1 ).isUserLoggedIn ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->isUserLoggedIn()Z
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 948 */
} // :cond_0
} // :goto_0
return;
/* .line 920 */
} // :cond_1
v1 = this.this$0;
int v2 = 1; // const/4 v2, 0x1
com.openfeint.internal.OpenFeintInternal .access$1102 ( v1,v2 );
/* .line 922 */
v1 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$1200 ( v1 );
/* .line 924 */
/* .local v0, "savedUser":Lcom/openfeint/api/resource/User; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 925 */
final String v1 = "OpenFeint"; // const-string v1, "OpenFeint"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Logging in last known user: "; // const-string v3, "Logging in last known user: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.name;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
/* .line 927 */
v1 = this.this$0;
/* new-instance v2, Lcom/openfeint/internal/OpenFeintInternal$10$1; */
/* invoke-direct {v2, p0, v0}, Lcom/openfeint/internal/OpenFeintInternal$10$1;-><init>(Lcom/openfeint/internal/OpenFeintInternal$10;Lcom/openfeint/api/resource/User;)V */
(( com.openfeint.internal.OpenFeintInternal ) v1 ).loginUser ( v4, v4, v4, v2 ); // invoke-virtual {v1, v4, v4, v4, v2}, Lcom/openfeint/internal/OpenFeintInternal;->loginUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/internal/request/IRawRequestDelegate;)V
/* .line 944 */
} // :cond_2
final String v1 = "OpenFeint"; // const-string v1, "OpenFeint"
final String v2 = "No last user, launch intro flow"; // const-string v2, "No last user, launch intro flow"
com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
/* .line 945 */
v1 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$1400 ( v1 );
/* .line 946 */
v1 = this.this$0;
/* iget-boolean v2, p0, Lcom/openfeint/internal/OpenFeintInternal$10;->val$spotlight:Z */
(( com.openfeint.internal.OpenFeintInternal ) v1 ).launchIntroFlow ( v2 ); // invoke-virtual {v1, v2}, Lcom/openfeint/internal/OpenFeintInternal;->launchIntroFlow(Z)V
} // .end method

public class com.facebook.android.AsyncFacebookRunner {
	 /* .source "AsyncFacebookRunner.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/facebook/android/AsyncFacebookRunner$RequestListener; */
	 /* } */
} // .end annotation
/* # instance fields */
com.facebook.android.Facebook fb;
/* # direct methods */
public com.facebook.android.AsyncFacebookRunner ( ) {
	 /* .locals 0 */
	 /* .param p1, "fb" # Lcom/facebook/android/Facebook; */
	 /* .prologue */
	 /* .line 51 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 52 */
	 this.fb = p1;
	 /* .line 53 */
	 return;
} // .end method
/* # virtual methods */
public void logout ( android.content.Context p0, com.facebook.android.AsyncFacebookRunner$RequestListener p1 ) {
	 /* .locals 1 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "listener" # Lcom/facebook/android/AsyncFacebookRunner$RequestListener; */
	 /* .prologue */
	 /* .line 102 */
	 int v0 = 0; // const/4 v0, 0x0
	 (( com.facebook.android.AsyncFacebookRunner ) p0 ).logout ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/android/AsyncFacebookRunner;->logout(Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
	 /* .line 103 */
	 return;
} // .end method
public void logout ( android.content.Context p0, com.facebook.android.AsyncFacebookRunner$RequestListener p1, java.lang.Object p2 ) {
	 /* .locals 1 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "listener" # Lcom/facebook/android/AsyncFacebookRunner$RequestListener; */
	 /* .param p3, "state" # Ljava/lang/Object; */
	 /* .prologue */
	 /* .line 80 */
	 /* new-instance v0, Lcom/facebook/android/AsyncFacebookRunner$1; */
	 /* invoke-direct {v0, p0, p1, p2, p3}, Lcom/facebook/android/AsyncFacebookRunner$1;-><init>(Lcom/facebook/android/AsyncFacebookRunner;Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */
	 (( com.facebook.android.AsyncFacebookRunner$1 ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/facebook/android/AsyncFacebookRunner$1;->start()V
	 /* .line 99 */
	 return;
} // .end method
public void request ( android.os.Bundle p0, com.facebook.android.AsyncFacebookRunner$RequestListener p1 ) {
	 /* .locals 6 */
	 /* .param p1, "parameters" # Landroid/os/Bundle; */
	 /* .param p2, "listener" # Lcom/facebook/android/AsyncFacebookRunner$RequestListener; */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 141 */
	 final String v3 = "GET"; // const-string v3, "GET"
	 /* move-object v0, p0 */
	 /* move-object v2, p1 */
	 /* move-object v4, p2 */
	 /* move-object v5, v1 */
	 /* invoke-virtual/range {v0 ..v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */
	 /* .line 142 */
	 return;
} // .end method
public void request ( android.os.Bundle p0, com.facebook.android.AsyncFacebookRunner$RequestListener p1, java.lang.Object p2 ) {
	 /* .locals 6 */
	 /* .param p1, "parameters" # Landroid/os/Bundle; */
	 /* .param p2, "listener" # Lcom/facebook/android/AsyncFacebookRunner$RequestListener; */
	 /* .param p3, "state" # Ljava/lang/Object; */
	 /* .prologue */
	 /* .line 137 */
	 int v1 = 0; // const/4 v1, 0x0
	 final String v3 = "GET"; // const-string v3, "GET"
	 /* move-object v0, p0 */
	 /* move-object v2, p1 */
	 /* move-object v4, p2 */
	 /* move-object v5, p3 */
	 /* invoke-virtual/range {v0 ..v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */
	 /* .line 138 */
	 return;
} // .end method
public void request ( java.lang.String p0, android.os.Bundle p1, com.facebook.android.AsyncFacebookRunner$RequestListener p2 ) {
	 /* .locals 6 */
	 /* .param p1, "graphPath" # Ljava/lang/String; */
	 /* .param p2, "parameters" # Landroid/os/Bundle; */
	 /* .param p3, "listener" # Lcom/facebook/android/AsyncFacebookRunner$RequestListener; */
	 /* .prologue */
	 /* .line 212 */
	 final String v3 = "GET"; // const-string v3, "GET"
	 int v5 = 0; // const/4 v5, 0x0
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move-object v2, p2 */
	 /* move-object v4, p3 */
	 /* invoke-virtual/range {v0 ..v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */
	 /* .line 213 */
	 return;
} // .end method
public void request ( java.lang.String p0, android.os.Bundle p1, com.facebook.android.AsyncFacebookRunner$RequestListener p2, java.lang.Object p3 ) {
	 /* .locals 6 */
	 /* .param p1, "graphPath" # Ljava/lang/String; */
	 /* .param p2, "parameters" # Landroid/os/Bundle; */
	 /* .param p3, "listener" # Lcom/facebook/android/AsyncFacebookRunner$RequestListener; */
	 /* .param p4, "state" # Ljava/lang/Object; */
	 /* .prologue */
	 /* .line 206 */
	 final String v3 = "GET"; // const-string v3, "GET"
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move-object v2, p2 */
	 /* move-object v4, p3 */
	 /* move-object v5, p4 */
	 /* invoke-virtual/range {v0 ..v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */
	 /* .line 207 */
	 return;
} // .end method
public void request ( java.lang.String p0, android.os.Bundle p1, java.lang.String p2, com.facebook.android.AsyncFacebookRunner$RequestListener p3, java.lang.Object p4 ) {
	 /* .locals 7 */
	 /* .param p1, "graphPath" # Ljava/lang/String; */
	 /* .param p2, "parameters" # Landroid/os/Bundle; */
	 /* .param p3, "httpMethod" # Ljava/lang/String; */
	 /* .param p4, "listener" # Lcom/facebook/android/AsyncFacebookRunner$RequestListener; */
	 /* .param p5, "state" # Ljava/lang/Object; */
	 /* .prologue */
	 /* .line 250 */
	 /* new-instance v0, Lcom/facebook/android/AsyncFacebookRunner$2; */
	 /* move-object v1, p0 */
	 /* move-object v2, p1 */
	 /* move-object v3, p2 */
	 /* move-object v4, p3 */
	 /* move-object v5, p4 */
	 /* move-object v6, p5 */
	 /* invoke-direct/range {v0 ..v6}, Lcom/facebook/android/AsyncFacebookRunner$2;-><init>(Lcom/facebook/android/AsyncFacebookRunner;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */
	 (( com.facebook.android.AsyncFacebookRunner$2 ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/facebook/android/AsyncFacebookRunner$2;->start()V
	 /* .line 264 */
	 return;
} // .end method
public void request ( java.lang.String p0, com.facebook.android.AsyncFacebookRunner$RequestListener p1 ) {
	 /* .locals 6 */
	 /* .param p1, "graphPath" # Ljava/lang/String; */
	 /* .param p2, "listener" # Lcom/facebook/android/AsyncFacebookRunner$RequestListener; */
	 /* .prologue */
	 /* .line 172 */
	 /* new-instance v2, Landroid/os/Bundle; */
	 /* invoke-direct {v2}, Landroid/os/Bundle;-><init>()V */
	 final String v3 = "GET"; // const-string v3, "GET"
	 int v5 = 0; // const/4 v5, 0x0
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move-object v4, p2 */
	 /* invoke-virtual/range {v0 ..v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */
	 /* .line 173 */
	 return;
} // .end method
public void request ( java.lang.String p0, com.facebook.android.AsyncFacebookRunner$RequestListener p1, java.lang.Object p2 ) {
	 /* .locals 6 */
	 /* .param p1, "graphPath" # Ljava/lang/String; */
	 /* .param p2, "listener" # Lcom/facebook/android/AsyncFacebookRunner$RequestListener; */
	 /* .param p3, "state" # Ljava/lang/Object; */
	 /* .prologue */
	 /* .line 168 */
	 /* new-instance v2, Landroid/os/Bundle; */
	 /* invoke-direct {v2}, Landroid/os/Bundle;-><init>()V */
	 final String v3 = "GET"; // const-string v3, "GET"
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move-object v4, p2 */
	 /* move-object v5, p3 */
	 /* invoke-virtual/range {v0 ..v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */
	 /* .line 169 */
	 return;
} // .end method

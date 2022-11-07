class inal implements com.a.a.j {
	 /* # interfaces */
	 /* # instance fields */
	 private com.a.a.g a; //synthetic
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 2 */
		 final String v0 = "Facebook-authorize"; // const-string v0, "Facebook-authorize"
		 final String v1 = "Login canceled"; // const-string v1, "Login canceled"
		 android.util.Log .d ( v0,v1 );
		 v0 = this.a;
		 com.a.a.g .a ( v0 );
		 return;
	 } // .end method
	 public final void a ( android.os.Bundle p0 ) {
		 /* .locals 4 */
		 android.webkit.CookieSyncManager .getInstance ( );
		 (( android.webkit.CookieSyncManager ) v0 ).sync ( ); // invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->sync()V
		 v0 = this.a;
		 final String v1 = "access_token"; // const-string v1, "access_token"
		 (( android.os.Bundle ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 (( com.a.a.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/a/g;->a(Ljava/lang/String;)V
		 v0 = this.a;
		 final String v1 = "expires_in"; // const-string v1, "expires_in"
		 (( android.os.Bundle ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 (( com.a.a.g ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/a/g;->b(Ljava/lang/String;)V
		 v0 = this.a;
		 v0 = 		 (( com.a.a.g ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/a/g;->a()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v0 = "Facebook-authorize"; // const-string v0, "Facebook-authorize"
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v2 = "Login Success! access_token="; // const-string v2, "Login Success! access_token="
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v2 = this.a;
			 (( com.a.a.g ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/a/a/g;->b()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v2 = " expires="; // const-string v2, " expires="
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v2 = this.a;
			 (( com.a.a.g ) v2 ).c ( ); // invoke-virtual {v2}, Lcom/a/a/g;->c()J
			 /* move-result-wide v2 */
			 (( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .d ( v0,v1 );
			 v0 = this.a;
			 com.a.a.g .a ( v0 );
		 } // :goto_0
		 return;
	 } // :cond_0
	 v0 = this.a;
	 com.a.a.g .a ( v0 );
	 /* new-instance v1, Lcom/a/a/d; */
	 final String v2 = "Failed to receive access token."; // const-string v2, "Failed to receive access token."
	 /* invoke-direct {v1, v2}, Lcom/a/a/d;-><init>(Ljava/lang/String;)V */
} // .end method
public final void a ( Object p0 ) {
	 /* .locals 3 */
	 final String v0 = "Facebook-authorize"; // const-string v0, "Facebook-authorize"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Login failed: "; // const-string v2, "Login failed: "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v0,v1 );
	 v0 = this.a;
	 com.a.a.g .a ( v0 );
	 return;
} // .end method
public final void a ( Object p0 ) {
	 /* .locals 3 */
	 final String v0 = "Facebook-authorize"; // const-string v0, "Facebook-authorize"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Login failed: "; // const-string v2, "Login failed: "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v0,v1 );
	 v0 = this.a;
	 com.a.a.g .a ( v0 );
	 return;
} // .end method

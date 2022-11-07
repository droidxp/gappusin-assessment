public class net.chobin.android.a.u {
	 /* # instance fields */
	 private android.content.SharedPreferences$Editor a;
	 private final android.content.SharedPreferences a;
	 private final net.chobin.android.a.s a;
	 /* # direct methods */
	 public net.chobin.android.a.u ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 net.chobin.android.a.q .a ( p1 );
		 this.a = p2;
		 this.a = p3;
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 v0 = this.a;
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 try { // :try_start_0
				 v1 = this.a;
				 /* :try_end_0 */
				 /* .catch Lnet/chobin/android/a/y; {:try_start_0 ..:try_end_0} :catch_0 */
			 } // :cond_0
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "PreferenceObfuscator:Validation error while reading preference: "; // const-string v1, "PreferenceObfuscator:Validation error while reading preference: "
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 net.chobin.android.a.q .a ( v0 );
	 } // .end method
	 public void a ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.a;
			 int v0 = 0; // const/4 v0, 0x0
			 this.a = v0;
		 } // :cond_0
		 return;
	 } // .end method
	 public void a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 v0 = this.a;
		 /* if-nez v0, :cond_0 */
		 v0 = this.a;
		 this.a = v0;
	 } // :cond_0
	 v0 = this.a;
	 v1 = this.a;
	 return;
} // .end method

public class com.zong.android.engine.task.a {
	 /* # static fields */
	 private static final java.lang.String a;
	 /* # direct methods */
	 static com.zong.android.engine.task.a ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lcom/zong/android/engine/task/a; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 com.zong.android.engine.task.a ( ) { //synthethic
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lcom/zong/android/engine/task/a;-><init>(B)V */
		 return;
	 } // .end method
	 private com.zong.android.engine.task.a ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 v0 = com.zong.android.engine.task.a.a;
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "SAVING MSISDN "; // const-string v2, "SAVING MSISDN "
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 zongfuscated.q .a ( v0,v1 );
		 final String v0 = "PhoneContext"; // const-string v0, "PhoneContext"
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.content.Context ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 final String v1 = "msisdn"; // const-string v1, "msisdn"
		 return;
	 } // .end method
	 public static java.lang.String b ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 v0 = com.zong.android.engine.task.a.a;
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "GETTING MSISDN "; // const-string v2, "GETTING MSISDN "
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 zongfuscated.q .a ( v0,v1 );
		 final String v0 = "PhoneContext"; // const-string v0, "PhoneContext"
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.content.Context ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v1 = "msisdn"; // const-string v1, "msisdn"
		 } // :goto_0
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method

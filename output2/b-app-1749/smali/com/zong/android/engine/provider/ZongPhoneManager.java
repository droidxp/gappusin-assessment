public class com.zong.android.engine.provider.ZongPhoneManager {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/zong/android/engine/provider/ZongPhoneManager$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String a;
/* # direct methods */
static com.zong.android.engine.provider.ZongPhoneManager ( ) {
	 /* .locals 1 */
	 /* const-class v0, Lcom/zong/android/engine/provider/ZongPhoneManager; */
	 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
	 return;
} // .end method
 com.zong.android.engine.provider.ZongPhoneManager ( ) { //synthethic
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, v0}, Lcom/zong/android/engine/provider/ZongPhoneManager;-><init>(B)V */
	 return;
} // .end method
private com.zong.android.engine.provider.ZongPhoneManager ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static com.zong.android.engine.provider.ZongPhoneManager getInstance ( ) {
	 /* .locals 1 */
	 com.zong.android.engine.provider.ZongPhoneManager$a .a ( );
} // .end method
/* # virtual methods */
public com.zong.android.engine.provider.PhoneState getPhoneState ( android.content.Context p0 ) {
	 /* .locals 6 */
	 final String v0 = "phone"; // const-string v0, "phone"
	 (( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v0, Landroid/telephony/TelephonyManager; */
	 /* new-instance v1, Lcom/zong/android/engine/provider/PhoneState; */
	 /* invoke-direct {v1, v0}, Lcom/zong/android/engine/provider/PhoneState;-><init>(Landroid/telephony/TelephonyManager;)V */
	 v0 = com.zong.android.engine.provider.ZongPhoneManager.a;
	 final String v2 = "Phone State"; // const-string v2, "Phone State"
	 int v3 = 1; // const/4 v3, 0x1
	 /* new-array v3, v3, [Ljava/lang/String; */
	 int v4 = 0; // const/4 v4, 0x0
	 (( com.zong.android.engine.provider.PhoneState ) v1 ).toString ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/provider/PhoneState;->toString()Ljava/lang/String;
	 /* aput-object v5, v3, v4 */
	 zongfuscated.q .a ( v0,v2,v3 );
} // .end method

public class com.acv.bc.bc.Mm {
	 /* # instance fields */
	 private java.lang.String a;
	 private java.lang.String b;
	 private Integer c;
	 private java.lang.String d;
	 private java.lang.String e;
	 private Integer f;
	 private Integer g;
	 private android.content.Context h;
	 private java.lang.String i;
	 /* # direct methods */
	 public com.acv.bc.bc.Mm ( ) {
		 /* .locals 1 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v0, p0, Lcom/acv/bc/bc/Mm;->f:I */
		 /* iput v0, p0, Lcom/acv/bc/bc/Mm;->g:I */
		 this.h = p1;
		 /* invoke-direct {p0}, Lcom/acv/bc/bc/Mm;->a()V */
		 return;
	 } // .end method
	 private void a ( ) {
		 /* .locals 4 */
		 v0 = this.h;
		 final String v1 = "phone"; // const-string v1, "phone"
		 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/telephony/TelephonyManager; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* new-instance v2, Landroid/util/DisplayMetrics; */
			 /* invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V */
			 v1 = this.h;
			 final String v3 = "window"; // const-string v3, "window"
			 (( android.content.Context ) v1 ).getSystemService ( v3 ); // invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
			 /* check-cast v1, Landroid/view/WindowManager; */
			 (( android.view.Display ) v1 ).getMetrics ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
			 /* iget v1, v2, Landroid/util/DisplayMetrics;->widthPixels:I */
			 /* iput v1, p0, Lcom/acv/bc/bc/Mm;->f:I */
			 /* iget v1, v2, Landroid/util/DisplayMetrics;->heightPixels:I */
			 /* iput v1, p0, Lcom/acv/bc/bc/Mm;->g:I */
			 (( android.telephony.TelephonyManager ) v0 ).getDeviceId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
			 this.a = v1;
			 v1 = this.h;
			 final String v2 = "phone"; // const-string v2, "phone"
			 (( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
			 /* check-cast v1, Landroid/telephony/TelephonyManager; */
			 (( android.telephony.TelephonyManager ) v1 ).getSubscriberId ( ); // invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 (( java.lang.String ) v1 ).trim ( ); // invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
				 v2 = 				 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
				 /* if-lez v2, :cond_1 */
				 this.b = v1;
			 } // :goto_0
			 v0 = 			 (( android.telephony.TelephonyManager ) v0 ).getNetworkType ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkType()I
			 /* iput v0, p0, Lcom/acv/bc/bc/Mm;->c:I */
			 v0 = this.h;
			 /* new-instance v1, Ljava/lang/String; */
			 /* const/16 v2, 0xc */
			 /* new-array v2, v2, [C */
			 /* fill-array-data v2, :array_0 */
			 /* invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V */
			 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
			 /* check-cast v0, Landroid/net/ConnectivityManager; */
			 (( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 (( android.net.NetworkInfo ) v0 ).getTypeName ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;
				 (( java.lang.String ) v1 ).toLowerCase ( ); // invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
				 /* new-instance v2, Ljava/lang/String; */
				 int v3 = 6; // const/4 v3, 0x6
				 /* new-array v3, v3, [C */
				 /* fill-array-data v3, :array_1 */
				 /* invoke-direct {v2, v3}, Ljava/lang/String;-><init>([C)V */
				 v1 = 				 (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 /* if-nez v1, :cond_2 */
				 (( android.net.NetworkInfo ) v0 ).getTypeName ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;
				 (( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
				 this.i = v0;
			 } // :cond_0
		 } // :goto_1
		 /* invoke-direct {p0}, Lcom/acv/bc/bc/Mm;->b()Ljava/lang/String; */
		 this.d = v0;
		 /* new-instance v0, Landroid/webkit/WebView; */
		 v1 = this.h;
		 /* invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
		 (( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
		 (( android.webkit.WebSettings ) v0 ).getUserAgentString ( ); // invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;
		 this.e = v0;
		 return;
	 } // :cond_1
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 (( android.telephony.TelephonyManager ) v0 ).getNetworkOperator ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;
	 java.lang.String .valueOf ( v2 );
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* new-instance v2, Ljava/lang/String; */
	 /* const/16 v3, 0x8 */
	 /* new-array v3, v3, [C */
	 /* fill-array-data v3, :array_2 */
	 /* invoke-direct {v2, v3}, Ljava/lang/String;-><init>([C)V */
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 this.b = v1;
} // :cond_2
(( android.net.NetworkInfo ) v0 ).getExtraInfo ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;
(( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
this.i = v0;
/* :array_0 */
/* .array-data 2 */
/* 0x63s */
/* 0x6fs */
/* 0x6es */
/* 0x6es */
/* 0x65s */
/* 0x63s */
/* 0x74s */
/* 0x69s */
/* 0x76s */
/* 0x69s */
/* 0x74s */
/* 0x79s */
} // .end array-data
/* :array_1 */
/* .array-data 2 */
/* 0x6ds */
/* 0x6fs */
/* 0x62s */
/* 0x69s */
/* 0x6cs */
/* 0x65s */
} // .end array-data
/* :array_2 */
/* .array-data 2 */
/* 0x30s */
/* 0x30s */
/* 0x30s */
/* 0x30s */
/* 0x30s */
/* 0x30s */
/* 0x30s */
/* 0x30s */
} // .end array-data
} // .end method
private java.lang.String b ( ) {
/* .locals 2 */
v0 = this.h;
final String v1 = "wifi"; // const-string v1, "wifi"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/net/wifi/WifiManager; */
(( android.net.wifi.WifiManager ) v0 ).getConnectionInfo ( ); // invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.net.wifi.WifiInfo ) v0 ).getMacAddress ( ); // invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public void a ( java.io.DataOutputStream p0 ) {
/* .locals 3 */
v0 = com.a.Gb.g;
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = " "; // const-string v0, " "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* new-instance v1, Ljava/lang/String; */
int v2 = 4; // const/4 v2, 0x4
/* new-array v2, v2, [C */
/* fill-array-data v2, :array_0 */
/* invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "="; // const-string v1, "="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = com.a.Gb.g;
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = " "; // const-string v0, " "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* new-instance v1, Ljava/lang/String; */
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [C */
/* fill-array-data v2, :array_1 */
/* invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "="; // const-string v1, "="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.e;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = this.a;
final String v1 = "unknown"; // const-string v1, "unknown"
com.acv.bc.bc.Gg .a ( v0,v1 );
(( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.b;
final String v1 = "unknown"; // const-string v1, "unknown"
com.acv.bc.bc.Gg .a ( v0,v1 );
(( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = this.d;
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = "_"; // const-string v1, "_"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.i;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "unknown"; // const-string v1, "unknown"
com.acv.bc.bc.Gg .a ( v0,v1 );
(( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.e;
final String v1 = "unknown"; // const-string v1, "unknown"
com.acv.bc.bc.Gg .a ( v0,v1 );
(( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget v0, p0, Lcom/acv/bc/bc/Mm;->c:I */
(( java.io.DataOutputStream ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
/* iget v0, p0, Lcom/acv/bc/bc/Mm;->f:I */
(( java.io.DataOutputStream ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
/* iget v0, p0, Lcom/acv/bc/bc/Mm;->g:I */
(( java.io.DataOutputStream ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
return;
/* nop */
/* :array_0 */
/* .array-data 2 */
/* 0x69s */
/* 0x6ds */
/* 0x65s */
/* 0x69s */
} // .end array-data
/* :array_1 */
/* .array-data 2 */
/* 0x75s */
/* 0x61s */
} // .end array-data
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/String; */
/* const/16 v1, 0x9 */
/* new-array v1, v1, [C */
/* fill-array-data v1, :array_0 */
/* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
int v1 = 5; // const/4 v1, 0x5
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
v3 = this.a;
/* aput-object v3, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
v3 = this.b;
/* aput-object v3, v1, v2 */
int v2 = 2; // const/4 v2, 0x2
v3 = this.e;
/* aput-object v3, v1, v2 */
int v2 = 3; // const/4 v2, 0x3
v3 = this.d;
/* aput-object v3, v1, v2 */
int v2 = 4; // const/4 v2, 0x4
/* iget v3, p0, Lcom/acv/bc/bc/Mm;->c:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
com.acv.bc.bc.Gg .a ( v0,v1 );
/* nop */
/* :array_0 */
/* .array-data 2 */
/* 0x54s */
/* 0x65s */
/* 0x6cs */
/* 0x65s */
/* 0x70s */
/* 0x68s */
/* 0x6fs */
/* 0x6es */
/* 0x79s */
} // .end array-data
} // .end method

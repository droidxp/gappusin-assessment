public class com.acv.a.Bb {
	 /* # instance fields */
	 private java.lang.String a;
	 private java.lang.String b;
	 private Integer c;
	 private java.lang.String d;
	 private java.lang.String e;
	 private android.content.Context f;
	 /* # direct methods */
	 public com.acv.a.Bb ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.f = p1;
		 /* invoke-direct {p0}, Lcom/acv/a/Bb;->a()V */
		 return;
	 } // .end method
	 private void a ( ) {
		 /* .locals 5 */
		 v0 = this.f;
		 final String v1 = "phone"; // const-string v1, "phone"
		 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/telephony/TelephonyManager; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( android.telephony.TelephonyManager ) v0 ).getDeviceId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
			 this.a = v1;
			 (( android.telephony.TelephonyManager ) v0 ).getSimOperator ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 (( java.lang.String ) v1 ).trim ( ); // invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
				 v2 = 				 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
				 /* if-lez v2, :cond_1 */
				 this.b = v1;
			 } // :goto_0
			 v0 = 			 (( android.telephony.TelephonyManager ) v0 ).getNetworkType ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkType()I
			 /* iput v0, p0, Lcom/acv/a/Bb;->c:I */
		 } // :cond_0
		 /* invoke-direct {p0}, Lcom/acv/a/Bb;->b()Ljava/lang/String; */
		 this.d = v0;
		 v0 = android.os.Build.MANUFACTURER;
		 v1 = android.os.Build.MODEL;
		 v2 = android.os.Build.DISPLAY;
		 v3 = android.os.Build.FINGERPRINT;
		 /* new-instance v4, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v0 );
		 /* invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v0 = " "; // const-string v0, " "
		 (( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = " "; // const-string v1, " "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.acv.a.Cc .a ( v3,v0 );
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
	 /* fill-array-data v3, :array_0 */
	 /* invoke-direct {v2, v3}, Ljava/lang/String;-><init>([C)V */
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 this.b = v1;
	 /* :array_0 */
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
v0 = this.f;
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
/* .locals 2 */
v0 = this.a;
final String v1 = "unknown"; // const-string v1, "unknown"
com.acv.a.Cc .a ( v0,v1 );
(( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.b;
final String v1 = "unknown"; // const-string v1, "unknown"
com.acv.a.Cc .a ( v0,v1 );
(( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.d;
final String v1 = "unknown"; // const-string v1, "unknown"
com.acv.a.Cc .a ( v0,v1 );
(( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.e;
final String v1 = "unknown"; // const-string v1, "unknown"
com.acv.a.Cc .a ( v0,v1 );
(( java.io.DataOutputStream ) p1 ).writeUTF ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget v0, p0, Lcom/acv/a/Bb;->c:I */
(( java.io.DataOutputStream ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
return;
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
/* iget v3, p0, Lcom/acv/a/Bb;->c:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
com.acv.a.Cc .a ( v0,v1 );
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

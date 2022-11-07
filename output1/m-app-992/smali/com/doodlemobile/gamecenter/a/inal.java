public class inal {
	 /* # static fields */
	 public static android.graphics.Bitmap a;
	 private static d;
	 /* # instance fields */
	 private android.content.Context b;
	 private java.lang.String c;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.b = p1;
		 return;
	 } // .end method
	 public static Boolean a ( android.content.Context p0 ) {
		 /* .locals 5 */
		 int v4 = 0; // const/4 v4, 0x0
		 try { // :try_start_0
			 final String v0 = "connectivity"; // const-string v0, "connectivity"
			 (( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
			 /* check-cast p0, Landroid/net/ConnectivityManager; */
			 if ( p0 != null) { // if-eqz p0, :cond_1
				 (( android.net.ConnectivityManager ) p0 ).getAllNetworkInfo ( ); // invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getAllNetworkInfo()[Landroid/net/NetworkInfo;
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 /* move v1, v4 */
				 } // :goto_0
				 /* array-length v2, v0 */
				 /* if-ge v1, v2, :cond_1 */
				 /* aget-object v2, v0, v1 */
				 (( android.net.NetworkInfo ) v2 ).getState ( ); // invoke-virtual {v2}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
				 v3 = android.net.NetworkInfo$State.CONNECTED;
				 /* :try_end_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* if-ne v2, v3, :cond_0 */
				 int v0 = 1; // const/4 v0, 0x1
			 } // :goto_1
		 } // :cond_0
		 /* add-int/lit8 v1, v1, 0x1 */
	 } // :cond_1
	 /* move v0, v4 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* move v0, v4 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* throw v0 */
} // .end method
private static Boolean a ( java.lang.String p0, android.content.Context p1 ) {
	 /* .locals 6 */
	 int v5 = 0; // const/4 v5, 0x0
	 final String v4 = "sdcard/.doodlemobile_featureviewnew/."; // const-string v4, "sdcard/.doodlemobile_featureviewnew/."
	 final String v3 = "xuming"; // const-string v3, "xuming"
	 /* new-instance v0, Ljava/lang/String; */
	 (( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
	 com.doodlemobile.gamecenter.e.a .a ( v1 );
	 /* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V */
	 v1 = 	 com.doodlemobile.gamecenter.d.a .a ( );
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "sdcard/.doodlemobile_featureviewnew/."; // const-string v2, "sdcard/.doodlemobile_featureviewnew/."
		 (( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.doodlemobile.gamecenter.d.a .a ( v1 );
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 v1 = com.doodlemobile.gamecenter.a.d.d;
			 /* array-length v1, v1 */
			 /* if-nez v1, :cond_0 */
			 final String v1 = "xuming"; // const-string v1, "xuming"
			 final String v1 = "mImage should delete"; // const-string v1, "mImage should delete"
			 android.util.Log .i ( v3,v1 );
			 try { // :try_start_0
				 /* new-instance v1, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
				 final String v2 = "sdcard/.doodlemobile_featureviewnew/."; // const-string v2, "sdcard/.doodlemobile_featureviewnew/."
				 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.doodlemobile.gamecenter.d.a .b ( v1 );
				 final String v1 = "xuming"; // const-string v1, "xuming"
				 final String v2 = "delete successfully"; // const-string v2, "delete successfully"
				 android.util.Log .i ( v1,v2 );
				 /* :try_end_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 } // :cond_0
		 } // :goto_0
		 v1 = com.doodlemobile.gamecenter.a.d.d;
		 /* if-nez v1, :cond_1 */
		 com.doodlemobile.gamecenter.e.d .a ( v0,p1 );
	 } // :cond_1
	 v0 = com.doodlemobile.gamecenter.a.d.d;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 v0 = com.doodlemobile.gamecenter.a.d.d;
		 /* array-length v0, v0 */
		 /* if-lez v0, :cond_2 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_1
	 /* :catch_0 */
	 /* move-exception v1 */
	 try { // :try_start_1
		 final String v2 = "xuming"; // const-string v2, "xuming"
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v4 = "delete not work"; // const-string v4, "delete not work"
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .w ( v2,v1 );
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* throw v0 */
	 } // :cond_2
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
private static android.graphics.Bitmap b ( ) {
	 /* .locals 3 */
	 try { // :try_start_0
		 v0 = com.doodlemobile.gamecenter.a.d.d;
		 int v1 = 0; // const/4 v1, 0x0
		 v2 = com.doodlemobile.gamecenter.a.d.d;
		 /* array-length v2, v2 */
		 android.graphics.BitmapFactory .decodeByteArray ( v0,v1,v2 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :goto_0
	 /* :catch_0 */
	 /* move-exception v0 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public final void a ( java.lang.String p0 ) {
	 /* .locals 0 */
	 this.c = p1;
	 return;
} // .end method
public final Boolean a ( ) {
	 /* .locals 5 */
	 int v4 = 0; // const/4 v4, 0x0
	 final String v0 = "xuming"; // const-string v0, "xuming"
	 v0 = this.c;
	 /* if-nez v0, :cond_0 */
	 /* move v0, v4 */
} // :goto_0
} // :cond_0
try { // :try_start_0
v0 = this.c;
v1 = this.b;
com.doodlemobile.gamecenter.a.d .a ( v0,v1 );
/* :try_end_0 */
v1 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
if ( v1 != null) { // if-eqz v1, :cond_3
	 try { // :try_start_1
		 final String v1 = "xuming"; // const-string v1, "xuming"
		 final String v2 = "FeatureScreen is Downloading!"; // const-string v2, "FeatureScreen is Downloading!"
		 android.util.Log .w ( v1,v2 );
		 com.doodlemobile.gamecenter.f.a .a ( v0 );
		 /* :try_end_1 */
		 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
	 } // :goto_1
	 try { // :try_start_2
		 v1 = com.doodlemobile.gamecenter.a.d.d;
		 if ( v1 != null) { // if-eqz v1, :cond_2
			 v1 = com.doodlemobile.gamecenter.a.d.d;
			 /* array-length v1, v1 */
			 /* :try_end_2 */
			 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
			 if ( v1 != null) { // if-eqz v1, :cond_2
				 try { // :try_start_3
					 /* new-instance v1, Ljava/lang/String; */
					 (( java.lang.String ) v0 ).getBytes ( ); // invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
					 com.doodlemobile.gamecenter.e.a .a ( v2 );
					 /* invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V */
					 v2 = 					 com.doodlemobile.gamecenter.d.a .a ( );
					 if ( v2 != null) { // if-eqz v2, :cond_1
						 /* new-instance v2, Ljava/lang/StringBuilder; */
						 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
						 final String v3 = "sdcard/.doodlemobile_featureviewnew/."; // const-string v3, "sdcard/.doodlemobile_featureviewnew/."
						 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
						 v3 = com.doodlemobile.gamecenter.a.d.d;
						 v2 = 						 com.doodlemobile.gamecenter.d.a .a ( v2,v3 );
						 /* if-nez v2, :cond_2 */
					 } // :cond_1
					 v2 = com.doodlemobile.gamecenter.a.d.d;
					 v3 = this.b;
					 com.doodlemobile.gamecenter.e.d .a ( v1,v2,v3 );
					 /* :try_end_3 */
					 /* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_2 */
				 } // :cond_2
			 } // :goto_2
			 try { // :try_start_4
				 v1 = com.doodlemobile.gamecenter.a.d.d;
				 /* if-nez v1, :cond_4 */
				 int v0 = 0; // const/4 v0, 0x0
				 /* move v0, v4 */
				 /* :catch_0 */
				 /* move-exception v1 */
				 int v1 = 0; // const/4 v1, 0x0
				 /* :catch_1 */
				 /* move-exception v0 */
				 /* move v0, v4 */
				 /* :catch_2 */
				 /* move-exception v1 */
				 final String v1 = "xuming"; // const-string v1, "xuming"
				 final String v2 = " save image file fail !"; // const-string v2, " save image file fail !"
				 android.util.Log .w ( v1,v2 );
			 } // :cond_3
			 final String v1 = "xuming"; // const-string v1, "xuming"
			 final String v2 = "FeatureScreen is already in sdcard or files!"; // const-string v2, "FeatureScreen is already in sdcard or files!"
			 android.util.Log .w ( v1,v2 );
		 } // :cond_4
		 v1 = com.doodlemobile.gamecenter.a.d.d;
		 if ( v1 != null) { // if-eqz v1, :cond_6
			 com.doodlemobile.gamecenter.a.d .b ( );
			 /* if-nez v1, :cond_5 */
			 v1 = this.b;
			 com.doodlemobile.gamecenter.d.d .a ( v0,v1 );
			 int v0 = 0; // const/4 v0, 0x0
			 /* move v0, v4 */
			 /* goto/16 :goto_0 */
		 } // :cond_5
		 final String v0 = "xuming"; // const-string v0, "xuming"
		 final String v1 = "FeatureScreen is decoded successfully!"; // const-string v1, "FeatureScreen is decoded successfully!"
		 android.util.Log .w ( v0,v1 );
		 /* :try_end_4 */
		 /* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_1 */
	 } // :cond_6
	 int v0 = 1; // const/4 v0, 0x1
	 /* goto/16 :goto_0 */
} // .end method
public final void b ( android.content.Context p0 ) {
	 /* .locals 0 */
	 this.b = p1;
	 return;
} // .end method

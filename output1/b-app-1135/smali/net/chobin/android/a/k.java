public class net.chobin.android.a.k implements android.content.ServiceConnection {
	 /* # interfaces */
	 /* # static fields */
	 private static final java.security.SecureRandom a;
	 /* # instance fields */
	 private final android.content.Context a;
	 private android.os.Handler a;
	 private final java.lang.String a;
	 private java.security.PublicKey a;
	 private final java.util.Queue a;
	 private final java.util.Set a;
	 private net.chobin.android.a.h a;
	 private final net.chobin.android.a.t a;
	 private final java.lang.String b;
	 /* # direct methods */
	 static net.chobin.android.a.k ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Ljava/security/SecureRandom; */
		 /* invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V */
		 return;
	 } // .end method
	 public net.chobin.android.a.k ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/HashSet; */
		 /* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
		 this.a = v0;
		 /* new-instance v0, Ljava/util/LinkedList; */
		 /* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
		 this.a = v0;
		 net.chobin.android.a.q .a ( p1 );
		 this.a = p1;
		 this.a = p2;
		 net.chobin.android.a.k .a ( p3 );
		 this.a = v0;
		 v0 = this.a;
		 (( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 this.a = v0;
		 v0 = this.a;
		 net.chobin.android.a.k .a ( p1,v0 );
		 this.b = v0;
		 /* new-instance v0, Landroid/os/HandlerThread; */
		 final String v1 = "background thread"; // const-string v1, "background thread"
		 /* invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V */
		 (( android.os.HandlerThread ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
		 /* new-instance v1, Landroid/os/Handler; */
		 (( android.os.HandlerThread ) v0 ).getLooper ( ); // invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
		 /* invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
		 this.a = v1;
		 return;
	 } // .end method
	 private Integer a ( ) {
		 /* .locals 1 */
		 v0 = net.chobin.android.a.k.a;
		 v0 = 		 (( java.security.SecureRandom ) v0 ).nextInt ( ); // invoke-virtual {v0}, Ljava/security/SecureRandom;->nextInt()I
	 } // .end method
	 static android.os.Handler a ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.a;
	 } // .end method
	 private static java.lang.String a ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
			 int v1 = 0; // const/4 v1, 0x0
			 (( android.content.pm.PackageManager ) v0 ).getPackageInfo ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
			 /* iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
			 java.lang.String .valueOf ( v0 );
			 /* :try_end_0 */
			 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v0 = "LicenseChecker: Package not found.could not get version code."; // const-string v0, "LicenseChecker: Package not found.could not get version code."
		 net.chobin.android.a.q .a ( v0 );
		 final String v0 = ""; // const-string v0, ""
	 } // .end method
	 private static java.security.PublicKey a ( java.lang.String p0 ) {
		 /* .locals 3 */
		 try { // :try_start_0
			 net.chobin.android.a.b .a ( p0 );
			 final String v1 = "RSA"; // const-string v1, "RSA"
			 java.security.KeyFactory .getInstance ( v1 );
			 /* new-instance v2, Ljava/security/spec/X509EncodedKeySpec; */
			 /* invoke-direct {v2, v0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V */
			 (( java.security.KeyFactory ) v1 ).generatePublic ( v2 ); // invoke-virtual {v1, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
			 /* :try_end_0 */
			 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Lnet/chobin/android/a/c; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 ..:try_end_0} :catch_2 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* new-instance v1, Ljava/lang/RuntimeException; */
			 /* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
			 /* throw v1 */
			 /* :catch_1 */
			 /* move-exception v0 */
			 final String v1 = "LicenseChecker: Could not decode from Base64."; // const-string v1, "LicenseChecker: Could not decode from Base64."
			 net.chobin.android.a.q .a ( v1 );
			 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
			 /* invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V */
			 /* throw v1 */
			 /* :catch_2 */
			 /* move-exception v0 */
			 final String v1 = "LicenseChecker: Invalid key specification."; // const-string v1, "LicenseChecker: Invalid key specification."
			 net.chobin.android.a.q .a ( v1 );
			 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
			 /* invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V */
			 /* throw v1 */
		 } // .end method
		 static java.security.PublicKey a ( Object p0 ) { //synthethic
			 /* .locals 1 */
			 v0 = this.a;
		 } // .end method
		 static java.util.Set a ( Object p0 ) { //synthethic
			 /* .locals 1 */
			 v0 = this.a;
		 } // .end method
		 static void a ( Object p0, Object p1 ) { //synthethic
			 /* .locals 0 */
			 /* invoke-direct {p0, p1}, Lnet/chobin/android/a/k;->b(Lnet/chobin/android/a/p;)V */
			 return;
		 } // .end method
		 private synchronized void a ( Object p0 ) {
			 /* .locals 1 */
			 /* monitor-enter p0 */
			 try { // :try_start_0
				 v0 = this.a;
				 v0 = 				 v0 = this.a;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* invoke-direct {p0}, Lnet/chobin/android/a/k;->c()V */
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 } // :cond_0
				 /* monitor-exit p0 */
				 return;
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* monitor-exit p0 */
				 /* throw v0 */
			 } // .end method
			 private void b ( ) {
				 /* .locals 6 */
			 } // :goto_0
			 v0 = this.a;
			 /* check-cast v0, Lnet/chobin/android/a/p; */
			 /* if-nez v0, :cond_0 */
			 return;
		 } // :cond_0
		 try { // :try_start_0
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 final String v2 = "LicenseChecker: Calling checkLicense on service for "; // const-string v2, "LicenseChecker: Calling checkLicense on service for "
			 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( net.chobin.android.a.p ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/a/p;->a()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 net.chobin.android.a.q .a ( v1 );
			 v1 = this.a;
			 v2 = 			 (( net.chobin.android.a.p ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/a/p;->a()I
			 /* int-to-long v2, v2 */
			 (( net.chobin.android.a.p ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/a/p;->a()Ljava/lang/String;
			 /* new-instance v5, Lnet/chobin/android/a/l; */
			 /* invoke-direct {v5, p0, v0}, Lnet/chobin/android/a/l;-><init>(Lnet/chobin/android/a/k;Lnet/chobin/android/a/p;)V */
			 v1 = this.a;
			 /* :try_end_0 */
			 /* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v1 */
			 final String v1 = "LicenseChecker: RemoteException in checkLicense call."; // const-string v1, "LicenseChecker: RemoteException in checkLicense call."
			 net.chobin.android.a.q .a ( v1 );
			 /* invoke-direct {p0, v0}, Lnet/chobin/android/a/k;->b(Lnet/chobin/android/a/p;)V */
		 } // .end method
		 static void b ( Object p0, Object p1 ) { //synthethic
			 /* .locals 0 */
			 /* invoke-direct {p0, p1}, Lnet/chobin/android/a/k;->a(Lnet/chobin/android/a/p;)V */
			 return;
		 } // .end method
		 private synchronized void b ( Object p0 ) {
			 /* .locals 3 */
			 /* monitor-enter p0 */
			 try { // :try_start_0
				 v0 = this.a;
				 /* const/16 v1, 0x123 */
				 int v2 = 0; // const/4 v2, 0x0
				 v0 = 				 v0 = this.a;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 (( net.chobin.android.a.p ) p1 ).a ( ); // invoke-virtual {p1}, Lnet/chobin/android/a/p;->a()Lnet/chobin/android/a/o;
					 /* const/16 v1, 0x123 */
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 } // :goto_0
				 /* monitor-exit p0 */
				 return;
			 } // :cond_0
			 try { // :try_start_1
				 (( net.chobin.android.a.p ) p1 ).a ( ); // invoke-virtual {p1}, Lnet/chobin/android/a/p;->a()Lnet/chobin/android/a/o;
				 /* const/16 v1, 0x123 */
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* monitor-exit p0 */
				 /* throw v0 */
			 } // .end method
			 private void c ( ) {
				 /* .locals 1 */
				 v0 = this.a;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 try { // :try_start_0
						 v0 = this.a;
						 (( android.content.Context ) v0 ).unbindService ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
						 /* :try_end_0 */
						 /* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
					 } // :goto_0
					 int v0 = 0; // const/4 v0, 0x0
					 this.a = v0;
				 } // :cond_0
				 return;
				 /* :catch_0 */
				 /* move-exception v0 */
				 final String v0 = "LicenseChecker: Unable to unbind from licensing service (already unbound)"; // const-string v0, "LicenseChecker: Unable to unbind from licensing service (already unbound)"
				 net.chobin.android.a.q .a ( v0 );
			 } // .end method
			 /* # virtual methods */
			 public synchronized void a ( ) {
				 /* .locals 1 */
				 /* monitor-enter p0 */
				 try { // :try_start_0
					 /* invoke-direct {p0}, Lnet/chobin/android/a/k;->c()V */
					 v0 = this.a;
					 (( android.os.Handler ) v0 ).getLooper ( ); // invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
					 (( android.os.Looper ) v0 ).quit ( ); // invoke-virtual {v0}, Landroid/os/Looper;->quit()V
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* monitor-exit p0 */
					 return;
					 /* :catchall_0 */
					 /* move-exception v0 */
					 /* monitor-exit p0 */
					 /* throw v0 */
				 } // .end method
				 public synchronized void a ( Object p0 ) {
					 /* .locals 8 */
					 /* monitor-enter p0 */
					 try { // :try_start_0
						 v0 = 						 v0 = this.a;
						 if ( v0 != null) { // if-eqz v0, :cond_0
							 final String v0 = "LicenseChecker: Using cached license response"; // const-string v0, "LicenseChecker: Using cached license response"
							 net.chobin.android.a.q .a ( v0 );
							 /* const/16 v0, 0x100 */
							 /* :try_end_0 */
							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
						 } // :goto_0
						 /* monitor-exit p0 */
						 return;
					 } // :cond_0
					 try { // :try_start_1
						 /* new-instance v0, Lnet/chobin/android/a/p; */
						 v1 = this.a;
						 v2 = this.a;
						 /* new-instance v3, Lnet/chobin/android/a/r; */
						 /* invoke-direct {v3}, Lnet/chobin/android/a/r;-><init>()V */
						 v5 = 						 /* invoke-direct {p0}, Lnet/chobin/android/a/k;->a()I */
						 v6 = this.a;
						 v7 = this.b;
						 /* move-object v4, p1 */
						 /* invoke-direct/range {v0 ..v7}, Lnet/chobin/android/a/p;-><init>(Landroid/content/Context;Lnet/chobin/android/a/t;Lnet/chobin/android/a/d;Lnet/chobin/android/a/o;ILjava/lang/String;Ljava/lang/String;)V */
						 v1 = this.a;
						 /* if-nez v1, :cond_2 */
						 final String v1 = "LicenseChecker: Binding to licensing service."; // const-string v1, "LicenseChecker: Binding to licensing service."
						 net.chobin.android.a.q .a ( v1 );
						 /* :try_end_1 */
						 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
						 try { // :try_start_2
							 v1 = this.a;
							 /* new-instance v2, Landroid/content/Intent; */
							 /* new-instance v3, Ljava/lang/String; */
							 final String v4 = "Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U="; // const-string v4, "Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U="
							 net.chobin.android.a.b .a ( v4 );
							 /* invoke-direct {v3, v4}, Ljava/lang/String;-><init>([B)V */
							 /* invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
							 int v3 = 1; // const/4 v3, 0x1
							 v1 = 							 (( android.content.Context ) v1 ).bindService ( v2, p0, v3 ); // invoke-virtual {v1, v2, p0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
							 if ( v1 != null) { // if-eqz v1, :cond_1
								 v1 = this.a;
								 /* :try_end_2 */
								 /* .catch Ljava/lang/SecurityException; {:try_start_2 ..:try_end_2} :catch_0 */
								 /* .catch Lnet/chobin/android/a/c; {:try_start_2 ..:try_end_2} :catch_1 */
								 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
								 /* :catch_0 */
								 /* move-exception v0 */
								 int v0 = 6; // const/4 v0, 0x6
								 try { // :try_start_3
									 /* :try_end_3 */
									 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
									 /* :catchall_0 */
									 /* move-exception v0 */
									 /* monitor-exit p0 */
									 /* throw v0 */
								 } // :cond_1
								 try { // :try_start_4
									 final String v1 = "LicenseChecker: Could not bind to service."; // const-string v1, "LicenseChecker: Could not bind to service."
									 net.chobin.android.a.q .a ( v1 );
									 /* invoke-direct {p0, v0}, Lnet/chobin/android/a/k;->b(Lnet/chobin/android/a/p;)V */
									 /* :try_end_4 */
									 /* .catch Ljava/lang/SecurityException; {:try_start_4 ..:try_end_4} :catch_0 */
									 /* .catch Lnet/chobin/android/a/c; {:try_start_4 ..:try_end_4} :catch_1 */
									 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
									 /* :catch_1 */
									 /* move-exception v0 */
									 try { // :try_start_5
										 (( net.chobin.android.a.c ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Lnet/chobin/android/a/c;->printStackTrace()V
									 } // :cond_2
									 v1 = this.a;
									 /* invoke-direct {p0}, Lnet/chobin/android/a/k;->b()V */
									 /* :try_end_5 */
									 /* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
								 } // .end method
								 public Boolean a ( ) {
									 /* .locals 1 */
									 v0 = 									 v0 = this.a;
								 } // .end method
								 public synchronized void onServiceConnected ( android.content.ComponentName p0, android.os.IBinder p1 ) {
									 /* .locals 1 */
									 /* monitor-enter p0 */
									 try { // :try_start_0
										 net.chobin.android.a.i .a ( p2 );
										 this.a = v0;
										 /* invoke-direct {p0}, Lnet/chobin/android/a/k;->b()V */
										 /* :try_end_0 */
										 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
										 /* monitor-exit p0 */
										 return;
										 /* :catchall_0 */
										 /* move-exception v0 */
										 /* monitor-exit p0 */
										 /* throw v0 */
									 } // .end method
									 public synchronized void onServiceDisconnected ( android.content.ComponentName p0 ) {
										 /* .locals 1 */
										 /* monitor-enter p0 */
										 try { // :try_start_0
											 final String v0 = "LicenseChecker: Service unexpectedly disconnected."; // const-string v0, "LicenseChecker: Service unexpectedly disconnected."
											 net.chobin.android.a.q .a ( v0 );
											 int v0 = 0; // const/4 v0, 0x0
											 this.a = v0;
											 /* :try_end_0 */
											 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
											 /* monitor-exit p0 */
											 return;
											 /* :catchall_0 */
											 /* move-exception v0 */
											 /* monitor-exit p0 */
											 /* throw v0 */
										 } // .end method

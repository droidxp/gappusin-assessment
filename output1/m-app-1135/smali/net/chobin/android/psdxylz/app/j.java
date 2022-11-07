public class net.chobin.android.psdxylz.app.j {
	 /* # static fields */
	 private static Integer a;
	 private static Long a;
	 private static net.chobin.android.psdxylz.app.aq a;
	 private static net.chobin.android.psdxylz.app.k a;
	 private static Boolean a;
	 private static Integer b;
	 private static Long b;
	 /* # direct methods */
	 static net.chobin.android.psdxylz.app.j ( ) {
		 /* .locals 1 */
		 int v0 = -1; // const/4 v0, -0x1
		 int v0 = 0; // const/4 v0, 0x0
		 net.chobin.android.psdxylz.app.j.a = (v0!= 0);
		 return;
	 } // .end method
	 public net.chobin.android.psdxylz.app.j ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 2 */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v0 */
		 /* sput-wide v0, Lnet/chobin/android/psdxylz/app/j;->b:J */
		 return;
	 } // .end method
	 public void a ( Object p0 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 net.chobin.android.psdxylz.app.j.a = (v0!= 0);
		 return;
	 } // .end method
	 public Boolean a ( ) {
		 /* .locals 2 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* sget-boolean v1, Lnet/chobin/android/psdxylz/app/a;->a:Z */
		 if ( v1 != null) { // if-eqz v1, :cond_3
		 } // :goto_0
		 /* sget-boolean v1, Lnet/chobin/android/psdxylz/app/j;->a:Z */
		 /* if-nez v1, :cond_0 */
		 v1 = net.chobin.android.psdxylz.app.j.a;
		 v1 = 		 (( net.chobin.android.psdxylz.app.k ) v1 ).a ( ); // invoke-virtual {v1}, Lnet/chobin/android/psdxylz/app/k;->a()Z
		 /* if-nez v1, :cond_0 */
		 /* sget-boolean v1, Lnet/chobin/android/psdxylz/app/a;->a:Z */
		 /* if-nez v1, :cond_2 */
	 } // :cond_0
	 /* sget-boolean v1, Lnet/chobin/android/psdxylz/app/j;->a:Z */
	 /* if-nez v1, :cond_3 */
	 v1 = net.chobin.android.psdxylz.app.j.a;
	 v1 = 	 (( net.chobin.android.psdxylz.app.k ) v1 ).a ( ); // invoke-virtual {v1}, Lnet/chobin/android/psdxylz/app/k;->a()Z
	 /* if-nez v1, :cond_3 */
} // :cond_1
} // :goto_1
} // :cond_2
/* const/16 v1, 0x3e8 */
(( net.chobin.android.psdxylz.app.j ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lnet/chobin/android/psdxylz/app/j;->b(I)Z
} // :cond_3
v1 = net.chobin.android.psdxylz.app.j.a;
v1 = (( net.chobin.android.psdxylz.app.k ) v1 ).a ( ); // invoke-virtual {v1}, Lnet/chobin/android/psdxylz/app/k;->a()Z
/* if-nez v1, :cond_4 */
/* sget-boolean v1, Lnet/chobin/android/psdxylz/app/j;->a:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_4
net.chobin.android.psdxylz.app.j.a = (v0!= 0);
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean a ( Integer p0 ) {
/* .locals 6 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* sput-wide v0, Lnet/chobin/android/psdxylz/app/j;->a:J */
/* int-to-long v0, p1 */
/* sget-wide v2, Lnet/chobin/android/psdxylz/app/j;->a:J */
/* sget-wide v4, Lnet/chobin/android/psdxylz/app/j;->b:J */
/* sub-long/2addr v2, v4 */
/* sub-long/2addr v0, v2 */
/* long-to-int v0, v0 */
/* if-gtz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
v0 = (( net.chobin.android.psdxylz.app.j ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lnet/chobin/android/psdxylz/app/j;->b(I)Z
/* sget-wide v1, Lnet/chobin/android/psdxylz/app/j;->a:J */
/* int-to-long v3, v3 */
/* add-long/2addr v1, v3 */
/* sput-wide v1, Lnet/chobin/android/psdxylz/app/j;->b:J */
} // .end method
public Boolean b ( Integer p0 ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* int-to-long v1, p1 */
try { // :try_start_0
java.lang.Thread .sleep ( v1,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* :catch_0 */
/* move-exception v1 */
int v1 = 0; // const/4 v1, 0x0
net.chobin.android.psdxylz.app.j.a = (v0!= 0);
/* move v0, v1 */
} // .end method

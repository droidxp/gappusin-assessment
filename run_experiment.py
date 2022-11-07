import glob
import subprocess
import shutil
import os

def changeFileName(f):
    return f.replace("./appsGappusin2/", "").replace("benign", "b").replace("malicious", "m").replace(".apk", "")


def absolutePath(f):
    return os.path.abspath(f)

files = glob.glob("./appsGappusin2/*.apk")

#shutil.rmtree('./output')

print("Phase 1: APKTOOL:")
for f in files:
   print(f'- Running the apktool for file {f}')
   p = subprocess.run(['apktool', 'd', f, '-o', f'output2/{changeFileName(f)}'], stdout=subprocess.PIPE, universal_newlines=True)
#   print(p.stdout)

print("Phase 2: SIMIDROID:")    
for f in files:     
   if("benign" in f):
       print(f'- Running the simidroid tool for files {f} and {f.replace("benign", "malicious")}')
       p = subprocess.run(['java', '-jar', 'SimiDroid.jar', absolutePath(f), absolutePath(f.replace("benign", "malicious"))], cwd="./SimiDroid/artefacts", stdout=subprocess.PIPE, universal_newlines=True)
#       print(p.stdout)
        

print("Phase 3: SMALI2JAVA:")
files = glob.glob("./output2/*app*")

for f in files:     
    print(f'- Running the smali2java tool for file {absolutePath(f)}')
    p = subprocess.run(['./smali2java/smali2java', '-path_to_smali', absolutePath(f)], stdout=subprocess.PIPE, universal_newlines=True)
#    print(p.stdout)
        

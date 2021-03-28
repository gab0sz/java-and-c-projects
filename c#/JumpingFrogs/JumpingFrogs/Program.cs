using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JumpingFrogs
{
    class JumpingFrogsShell : Shell
    {
        bool isstarted = false;
        int db;
        WaterLilyStatus[] status;

        string Status()
        {
            string now = string.Join(" ", status.Select(p => { return p.Equals(WaterLilyStatus.TOAD) ? "x" : (p.Equals(WaterLilyStatus.TREE_FROG) ? "o" : "_"); }));
            return now + "\n";
        }

        bool IsWin()
        {
            for (int i = 0, j = db*2; i < j; i++, j--)
            {
                if (!status[i].Equals(WaterLilyStatus.TREE_FROG) || !status.Equals(WaterLilyStatus.TOAD))
                {
                    return false;
                }

            }
            return true;
        }

        bool IsDeadLock()
        {
            int ind = 0;
            for (int i = 1; i < db*2; i++)
            {
                if (status[i].Equals(WaterLilyStatus.FREE))
                {
                    ind = i;
                    break;
                }
            }
            if (ind > 0)
            {
                if (status[ind - 1].Equals(WaterLilyStatus.TOAD))
                {
                    return false;
                }
            }
            if (ind > 1)
            {
                if (status[ind - 2].Equals(WaterLilyStatus.TOAD) && status[ind - 1].Equals(WaterLilyStatus.TREE_FROG))
                {
                    return false;
                }
            }
            if (ind < status.Length - 2)
            {
                if (status[ind + 2].Equals(WaterLilyStatus.TREE_FROG)&&status[ind + 1].Equals(WaterLilyStatus.TOAD))
                {
                    return false;
                }
            }
            if ( ind < status.Length - 1)
            {
                if (status[ind + 1].Equals(WaterLilyStatus.TREE_FROG))
                {
                    return false;
                }
            }
            return true;
        }

        class OJump : Command
        {
            private JumpingFrogsShell jf;

            public OJump(JumpingFrogsShell jf) : base ("o")
            {
                this.jf = jf;
            }
            public override bool Execute(params string[] args)
            {
                if (args.Length != 1 || !(args[0].Equals("jump")))
                {
                    return false;
                }
                for(int i = 0; i < jf.status.Length - 1; i++)
                {
                    if (jf.status[i].Equals(WaterLilyStatus.TREE_FROG) && jf.status[i-1].Equals(WaterLilyStatus.TOAD && jf.status[i-2].Equals(WaterLilyStatus.FREE)))
                    {
                        jf.status[i] = WaterLilyStatus.FREE;
                        jf.status[i - 2] = WaterLilyStatus.TREE_FROG;
                        jf.Format(jf.Status());
                        return true;
                    }
                }
                return false;
            }
        }

        class XJump : Command
        {
            private JumpingFrogsShell jf;

            public XJump(JumpingFrogsShell jf) : base ("x")
            {
                this.jf = jf;
            }
            public override bool Execute(params string[] args)
            {
                if (args.Length != 1 || !(args[0].Equals("jump")))
                {
                    return false;
                }
                for (int i = 0; i < jf.status.Length - 1; i++)
                {
                    if (jf.status[i].Equals(WaterLilyStatus.TOAD) && jf.status[i+1].Equals(WaterLilyStatus.TREE_FROG) && jf.status[i + 2].Equals(WaterLilyStatus.FREE))
                    {
                        jf.status[i] = WaterLilyStatus.FREE;
                        jf.status[i + 2] = WaterLilyStatus.TOAD;
                        jf.Format(jf.Status());
                        return true;
                    }
                }
                return false;
                        
            
            }

        }
        
        class XWalk : Command
        {
            private JumpingFrogsShell jf;

            public XWalk(JumpingFrogsShell jf) : base("x")
            {
                this.jf = jf;
            }

            public override bool Execute(params string[] args)
            {
                if (args.Length != 1 || !(args[0].Equals("walk")))
                {
                    return false;
                }
                for (int i = 0; i < jf.status.Length - 1; i++)
                {
                    if (jf.status[i].Equals(WaterLilyStatus.TOAD) && jf.status[i + 1].Equals(WaterLilyStatus.FREE))
                    {
                        jf.status[i] = WaterLilyStatus.FREE;
                        jf.status[i + 1] = WaterLilyStatus.TOAD;
                        jf.Format(jf.Status());
                        return true;
                    }
                }
                return false;
            }
        }

        class OWalk : Command
        {

            private JumpingFrogsShell jf;

            public OWalk(JumpingFrogsShell jf) : base("o")
            {
                this.jf = jf;
            }

            public override bool Execute(params string[] args)
            {
                if (args.Length != 1 || !(args[0].Equals("walk")))
                {
                    return false;
                }
                for (int i = 0; i < jf.status.Length; i++)
                {
                    if (jf.status[i].Equals(WaterLilyStatus.TREE_FROG) && jf.status[i - 1].Equals(WaterLilyStatus.FREE))
                    {
                        jf.status[i] = WaterLilyStatus.FREE;
                        jf.status[i - 1] = WaterLilyStatus.TREE_FROG;
                        jf.Format(jf.Status());
                        return true;
                    }
                }
                return false;
            }
        }



            class NewWithP : Command
            {
                private JumpingFrogsShell jf;

                public NewWithP(JumpingFrogsShell jf) : base("new")
                {
                    this.jf = jf;
                }

                public override bool Execute(params string[] args)
                {
                    if (args.Length != 1 || !(int.Parse(args[0]) > 0))
                    {
                        return false;
                    }
                    jf.isstarted = true;
                    jf.db = int.Parse(args[0]);
                    jf.status = new WaterLilyStatus[jf.db * 2 + 1];
                    for (int i = 0, j = jf.db * 2; i < j; i++, j--)
                    {
                        jf.status[i] = WaterLilyStatus.TOAD;
                        jf.status[j] = WaterLilyStatus.TREE_FROG;
                    }
                    jf.status[jf.db] = WaterLilyStatus.FREE;
                    jf.Format(jf.Status());
                    return true;
                }
            }

            class New : Command
            {
                private JumpingFrogsShell jf;
                public override bool Execute(params string[] args)
                {
                    if (args.Length != 0)
                    {
                        return false;
                    }
                    jf.isstarted = true;
                    jf.db = 3;
                    jf.status = new WaterLilyStatus[jf.db * 2 + 1];
                    for (int i = 0, j = jf.db * 2; i < j; i++, j--)
                    {
                        jf.status[i] = WaterLilyStatus.TOAD;
                        jf.status[j] = WaterLilyStatus.TREE_FROG;
                    }
                    jf.status[jf.db] = WaterLilyStatus.FREE;
                    jf.Format(jf.Status());
                    return true;
                }

                public New(JumpingFrogsShell jf) : base("new")
                {
                    this.jf = jf;
                }
            }


            public JumpingFrogsShell()
            {
                AddCommand(new New(this));
                AddCommand(new NewWithP(this));
                AddCommand(new XWalk(this));
                AddCommand(new OWalk(this));
                AddCommand(new XJump(this));
                AddCommand(new OJump(this));
            }
    }

        class Program
        {
            static void Main(string[] args)
            {
                Shell sh = new JumpingFrogsShell();
                sh.ReadEvalPrint();
            }
        }
}


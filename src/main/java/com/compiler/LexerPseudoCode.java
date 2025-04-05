    public Token nextWord() throws Exception {
        // check end of file
        // initialize machines
        // while some machine are in process
            // for each machine in process
                // skip finished machines
                // next step
                // if possible final state
                    // update last position machine would accept
            } // end for each machine in process
            // increment read position
        // end while some machine in process
        // select first machine with largest final pos (greedy)
        // throw in case of error
        // set next word [start pos, final pos)
        Token token = new Token();
        return token;
    }

:level-8 {:english {:level-title "Level 8"
                    :paragraph-1 (str "Human " applicant-name ", oftentimes it will be beneficial to parameterize queries to allow reuse with different variables. For example, in the query below $ is bound to db, and ?worker-id is bound to the UUID. The $ has been implicit in the previous queries and is most commonly used only when providing additional inputs. ")
                    :paragraph-2 "(d/q '[:find (pull ?e [:farm/_workers])\n       :in $ ?worker-id\n       :where [?e :worker/id ?worker-id]] db #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\")"
                    :paragraph-3 "Modify the query to use the author-id as an input to the query in order to retrieve information about the specific author."
                    :paragraph-4 "You may now continue to level 9."}
          :portuguese {:level-title "Nível 8"
                       :paragraph-1 (str "Humano " applicant-name ", muitas vezes será benéfico parametrizar as queries para permitir a reutilização com diferentes variáveis. Por exemplo, na query abaixo, $ está vinculado a db e ?worker-id está vinculado ao UUID. O $ foi implícito nas queries anteriores e é usualmente utilizado apenas ao fornecer entradas adicionais. ")
                       :paragraph-2 "(d/q '[:find (pull ?e [:farm/_workers])\n       :in $ ?worker-id\n       :where [?e :worker/id ?worker-id]] db #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\")"
                       :paragraph-3 "Modifique a query para usar o author-id como uma entrada para a query recuperar informações sobre o autor específico."
                       :paragraph-4 "Você pode seguir para o nível 9."}
          :spanish {:level-title "Nivel 8"
                    :paragraph-1 (str "Humano" applicant-name ", varias veces va a ser benéfico el parametrizar los queries para permitir el reuso con diferentes variables. Por ejemplo, en el query de abajo, el símbolo $ está vinculado a db, y ?worker-id está vinculado al UUID. El símbolo $ ha sido implícito en los previos queries y es comúnmente usado solo cuando se provee entradas adicionales. ")
                    :paragraph-2 "(d/q '[:find (pull ?e [:farm/_workers])\n       :in $ ?worker-id\n       :where [?e :worker/id ?worker-id]] db #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\")"
                    :paragraph-3 "Modifica el query para usar author-id como una entrada al query para obtener la información acerca de un autor específico."
                    :paragraph-4 "Puedes continuar al nivel 9."}}
